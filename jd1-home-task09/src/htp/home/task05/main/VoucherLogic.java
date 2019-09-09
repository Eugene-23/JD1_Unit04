package htp.home.task05.main;

import java.util.ArrayList;
import java.util.List;

public class VoucherLogic {
	
	public List<Voucher> getVoucherByType(VoucherList vouchers, VoucherType type) {
		List<Voucher> search = new ArrayList<Voucher>();
		for(Voucher vouch : vouchers.getVouchers()) {
			if(vouch.getType() == type) {
				search.add(vouch);
			}
		}
		return search;
	}

	public List<Voucher> getVoucherByTransport(VoucherList vouchers, String transport) {
		List<Voucher> search = new ArrayList<Voucher>();
		for(Voucher vouch : vouchers.getVouchers()) {
			if(vouch.getTransport() == transport) {
				search.add(vouch);
			}
		}
		return search;
	}

	public List<Voucher> getVoucherByNutrition(VoucherList vouchers, String nutrition) {
		List<Voucher> search = new ArrayList<Voucher>();
		for(Voucher vouch : vouchers.getVouchers()) {
			if(vouch.getNutrition() == nutrition) {
				search.add(vouch);
			}
		}
		return search;
	}
	
	public List<Voucher> getVoucherByAmountOfDays(VoucherList vouchers, int amountOfDays) {
		List<Voucher> search = new ArrayList<Voucher>();
		for(Voucher vouch : vouchers.getVouchers()) {
			if(vouch.getAmountOfDays() == amountOfDays) {
				search.add(vouch);
			}
		}
		return search;
	}
	
}
