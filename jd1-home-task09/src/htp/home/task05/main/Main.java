package htp.home.task05.main;

import java.util.ArrayList;
import java.util.List;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать 
 * возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
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
		
		System.out.println("Поиск по количеству дней:");
		print(vlog.getVoucherByAmountOfDays(vouchers, 7));	
		
		System.out.println('\n' + "Поиск по типу питания:");
		print(vlog.getVoucherByNutrition(vouchers, "breakfast"));

		System.out.println('\n' + "Поиск по типу транспорта:");
		print(vlog.getVoucherByTransport(vouchers, "plane"));

		System.out.println('\n' + "Поиск по типу отдыха:");
		print(vlog.getVoucherByType(vouchers, VoucherType.ACTIVE));
		
		List<Voucher> sortList = new ArrayList<Voucher>();
		sortList = vouchers.getVouchers();
		
		System.out.println('\n' + "Сортировка по стране:");
		CountryComparator countrySort = new CountryComparator();
		sortList.sort(countrySort);
		print(sortList);
		
		System.out.println('\n' + "Сортировка по количеству дней:");
		AmountOfDaysComparator amountOfDaysSort = new AmountOfDaysComparator();
		sortList.sort(amountOfDaysSort);
		print(sortList);

		System.out.println('\n' + "Сортировка по типу транспорта:");
		TransportComparator transportSort = new TransportComparator();
		sortList.sort(transportSort);
		print(sortList);

		System.out.println('\n' + "Сортировка по типу отдыха:");
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
