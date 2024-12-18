function solution(nums) {
    const number = nums.length / 2;
    // 중복 제거
    const pocketmon = new Set(nums);
    // 가져갈 수 있는 포켓몬 수가 포켓몬 종류 수보다 작은 경우
    // 가져갈 수 있는 포켓몬 수 반환
    if (number < Array.from(pocketmon).length){
        return number;
    }
    // 가져갈 수 있는 포켓몬 수가 포켓몬 종류보다 많은 경우
    // 포켓몬 종류 수 반환
    return Array.from(pocketmon).length;
}