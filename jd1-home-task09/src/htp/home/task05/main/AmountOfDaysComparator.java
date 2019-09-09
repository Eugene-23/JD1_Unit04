package htp.home.task05.main;

import java.util.Comparator;

public class AmountOfDaysComparator implements Comparator<Voucher> {

	@Override
	public int compare(Voucher v1, Voucher v2) {
		if(v1.getAmountOfDays() > v2.getAmountOfDays()) {
			return 1;
		} else if(v1.getAmountOfDays() < v2.getAmountOfDays()) {
			return -1;
		}
		return 0;
	}
}
