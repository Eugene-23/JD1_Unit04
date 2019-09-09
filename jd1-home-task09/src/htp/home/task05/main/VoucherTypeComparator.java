package htp.home.task05.main;

import java.util.Comparator;

public class VoucherTypeComparator implements Comparator<Voucher> {

	public int compare(Voucher v1, Voucher v2) {
		if(v1.getType().ordinal() > v2.getType().ordinal()) {
			return 1;
		} else if (v1.getType().ordinal() < v2.getType().ordinal()) {
			return -1;
		}
		return 0;
	}
}
