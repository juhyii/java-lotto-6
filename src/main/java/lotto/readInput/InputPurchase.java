package lotto.readInput;

import camp.nextstep.edu.missionutils.Console;
import lotto.validation.ErrorValidation;

public class InputPurchase {
	public static int purchaseAmount() {
		System.out.println("구입금액을 입력해 주세요.");
    	String input = Console.readLine();
        try {
            ErrorValidation.validatePurchaseAmount(input);
            return Integer.parseInt(input);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return purchaseAmount();
        }
    }
}