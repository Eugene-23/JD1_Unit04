package htp.home.task05.main;

import java.util.ArrayList;
import java.util.List;

public class VoucherList {
	
	private List<Voucher> vouchers;
	
	public VoucherList() {
		vouchers = new ArrayList<Voucher>();
	}

	public VoucherList(List<Voucher> vouchers) {		
		this.vouchers = vouchers;
	}

	public List<Voucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}
	
	public void add(Voucher v) {
		this.getVouchers().add(v);
	}
	
}
