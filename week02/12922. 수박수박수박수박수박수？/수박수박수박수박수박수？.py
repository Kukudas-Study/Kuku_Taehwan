def solution(n):
    answer = '' #리턴을 위한 빈 문자열
    for i in range(0,n):#n=5일 때 0~4 총 5번 실행
        if i%2==0:
            answer = answer + '수'
        else :
            answer = answer + '박'

    return answer

solution(5)