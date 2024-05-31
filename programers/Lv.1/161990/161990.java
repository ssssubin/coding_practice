class Solution {
    public int[] solution(String[] wallpaper) {
        // result 값 = (x1, y1, x2, y2)라고 했을 때,
        // wallpaper에서 맨 처음 "#"이 나온 행을 x1, 제일 나중에 "#"이 나온 행을 x2
        // wallpaper에서 맨 처음 "#"이 나온 열을 y1, 제일 나중에 "#"이 나온 열을 y2

        int[] result = new int[4];

        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                result[0] = i;
                break;
            }
        }
        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[wallpaper.length - 1 - i].contains("#")) {
                result[2] = (wallpaper.length - i);
                break;
            }
        }
        // wallpaper을 오른쪽으로 90도 회전 시켜서 y1, y2 구함
        for (int i = 0; i < wallpaper[0].length(); i++) {
            int cnt = 0;
            for (int j = 0; j < wallpaper.length; j++) {
                if (wallpaper[j].charAt(i) == '#') {
                    cnt++;
                    result[1] = i;
                    break;
                }
            }
            if (cnt != 0)
                break;
        }
        for (int i = wallpaper[0].length() - 1; i >= 0; i--) {
            int cnt = 0;
            for (int j = 0; j < wallpaper.length; j++) {
                if (wallpaper[j].charAt(i) == '#') {
                    cnt++;
                    result[3] = i + 1;
                    break;
                }
            }
            if (cnt != 0)
                break;
        }
        return result;
    }
}