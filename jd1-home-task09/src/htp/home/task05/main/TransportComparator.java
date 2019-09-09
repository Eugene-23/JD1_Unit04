package htp.home.task05.main;

import java.util.Comparator;

public class TransportComparator implements Comparator<Voucher> {

	public int compare(Voucher v1, Voucher v2) {
		return v1.getTransport().compareTo(v2.getTransport());
	}
}
