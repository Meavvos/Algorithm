int main(void) {
	int n, x, a, b, sum = 0;          //sum은 0으로 초기화를 해줘야한다.

	scanf("%d", &x);                  //정수형 x를 입력
	scanf("%d", &n);                  //정수형 n을 입력
	for (int i = 0; i < n; i++)       //입력받은 테스트케이스 n만큼 반복문 실행
	{
		scanf("%d %d", &a, &b);       //정수형 a, b를 입력
		sum += a * b;                 //sum에 가격 * 개수를 더한다.
	}
	if (x == sum)                     //만약 x가 sum과 같다면 Yes를 출력한다.
	{
		printf("Yes");
	}
	else                              //아니라면 No를 출력한다.
	{
		printf("No");
	}

	return 0;                         //리턴. 프로그램 종료.
}
