package htp.home.task05.main;

import java.util.ArrayList;
import java.util.List;

/*
 * ������������� �������. ������������ ����� ����������� ������� �� ������ ������������� ������� 
 * ���������� ���� (�����, ���������, �������, ������, ����� � �. �.) ��� ������������ ������. ��������� 
 * ����������� ������ ����������, ������� � ����� ����. ����������� ����� � ���������� �������.
 */

public class Main {

	public static void main(String[] args) {
		
		VoucherList vouchers = new VoucherList();
		
		vouchers.add(new Voucher(VoucherType.ACTIVE, "Spain", "train", "breakfast", 7));
		vouchers.add(new Voucher(VoucherType.CRUISE, "Caribian", "plane", "breakfast+dinner", 8));
		vouchers.add(new Voucher(VoucherType.EXCURSION, "Italy", "bus", "breakfast", 10));
		vouchers.add(new Voucher(VoucherType.RELAX, "Egypet", "plane", "all inclusive", 9));
		vouchers.add(new Voucher(VoucherType.SHOPPING, "Spain", "bus", "breakfast+dinner", 6));
		vouchers.add(new Voucher(VoucherType.TREATMENT, "Israel", "plane", "all inclusive", 7));
		vouchers.add(new Voucher(VoucherType.ACTIVE, "Australia", "plane", "breakfast", 12));
				
		VoucherLogic vlog = new VoucherLogic();
		
		System.out.println("����� �� ���������� ����:");
		print(vlog.getVoucherByAmountOfDays(vouchers, 7));	
		
		System.out.println('\n' + "����� �� ���� �������:");
		print(vlog.getVoucherByNutrition(vouchers, "breakfast"));

		System.out.println('\n' + "����� �� ���� ����������:");
		print(vlog.getVoucherByTransport(vouchers, "plane"));

		System.out.println('\n' + "����� �� ���� ������:");
		print(vlog.getVoucherByType(vouchers, VoucherType.ACTIVE));
		
		List<Voucher> sortList = new ArrayList<Voucher>();
		sortList = vouchers.getVouchers();
		
		System.out.println('\n' + "���������� �� ������:");
		CountryComparator countrySort = new CountryComparator();
		sortList.sort(countrySort);
		print(sortList);
		
		System.out.println('\n' + "���������� �� ���������� ����:");
		AmountOfDaysComparator amountOfDaysSort = new AmountOfDaysComparator();
		sortList.sort(amountOfDaysSort);
		print(sortList);

		System.out.println('\n' + "���������� �� ���� ����������:");
		TransportComparator transportSort = new TransportComparator();
		sortList.sort(transportSort);
		print(sortList);

		System.out.println('\n' + "���������� �� ���� ������:");
		VoucherTypeComparator typeSort = new VoucherTypeComparator();
		sortList.sort(typeSort);
		print(sortList);
	}
	
	
	public static void print(VoucherList vouchers) {
		for(Voucher vch : vouchers.getVouchers()) {
			System.out.println(vch.toString());
		}
	}
	
	public static void print(List<Voucher> vouchers) {
		for(Voucher vch : vouchers) {
			System.out.println(vch.toString());
		}
	}

}
