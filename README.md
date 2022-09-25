# java-baseball

- [x] 컴퓨터는 랜덤으로 3자리 숫자를 선택한다.


- [x] 선택된 랜덤 3자리 숫자(컴퓨터)를 비교하여 사용자에게 힌트를 제공한다.
    - [x] 같은 수, 같은 자리 -> 스트라이크
    - [x] 같은 수, 다른 자리 -> 볼
    - [x] 같은 수 전혀 없을 때 -> 포볼 또는 낫싱


- [x] 사용자는 3자리 숫자를 입력할 수 있다.
    - [ ] [1-9] 숫자만이 입력될 수 있다. -> IllegalArgumentEception -> 애플리케이션 종료 [[예외 처리]]
    - [x] 입력된 3자리 숫자(사용자)와 선택된 3가지 숫자(컴퓨터)를 비교한다.
    - [x] 컴퓨터는 입력된 3자리 숫자(사용자)에 대한 결과를 출력한다.


- [x] 상대방(컴퓨터)의 수(3자리)를 모두 맞추면 승리한다.
    - [x] 승리한 경우 게임이 종료된다.
    - [x] 게임이 종료되면 다시 시작할 수 있다.
        - [x] 1을 입력하면 재시작한다.
    - [x] 게임이 종료되면 완전히 종료할 수 있다.
        - [x] 2를 입력하면 완전히 종료한다.


- [x] 상대방(컴퓨터)의 수(3자리)를 모두 맞출 때 까지 3자리 숫자를 사용자가 입력한다.
  - [x] 최대 라운드 수를 채울시 종료된다.
    - [x] 게임이 종료되면 다시 시작할 수 있다.

---

<br>
<br>
<br>


1. 