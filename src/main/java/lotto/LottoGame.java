package lotto;

public class LottoGame {

    private final LottoGameController controller;

    public LottoGame() {
        controller = new LottoGameController();
    }

    public void start() {
        //구매금액 입력 및 로또 구매
        BuyCash buyCash = controller.inputBuyCash();
        Lottos lottos = controller.purchaseLotto(buyCash);
        controller.printBuyLottosInformation(lottos);

        //사용자 당첨번호 및 보너스 번호 입력
        WinningLotto winningLotto = inputWinningLotto();

        //결과 계산 및 출력
        Result result = controller.getResult(lottos, winningLotto);
        controller.printWinningResult(result, buyCash);
    }

    private WinningLotto inputWinningLotto() {
        WinningLotto winningLotto;
        Lotto winningNumbers = controller.inputWinningLotto();

        while (true) {
            try {
                LottoNumber bonusNumber = controller.inputBonusNumber();
                winningLotto = new WinningLotto(winningNumbers, bonusNumber);
                break;
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }

        return winningLotto;
    }
}
