# 프로그래머스 - 평균 구하기
# 메모 : 배열이 int이기 때문에 int로 나누면 소숫점이 나오지 않는다.
# double로 선언하여 double 나누기 int를 하면 double이 나오기 때문에 소숫점까지 출력이 가능하다.

class Solution {
    public double solution(int[] arr) {
        double answer = 0.0;
        double s = 0;
        
        for(int num : arr){
            s += num;
        }
        
        answer = s / arr.length;
        return answer;
    }
}
