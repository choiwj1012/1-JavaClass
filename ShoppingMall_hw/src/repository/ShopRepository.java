package repository;

import java.util.ArrayList;

import domain.Product;
import domain.User;

public class ShopRepository {
	
	// 상품 배열 리스트
	public static ArrayList<Product> products = new ArrayList<Product>();
	// 상품 숫자 카운팅
	public static int lastProductNumber = 0;
	
	// 유저 배열 리스트
	public static ArrayList<User> users = new ArrayList<User>();
	// 유저 숫자 카운팅
	public static int lastUserNumber = 0;
	// 로그인한 유저의 번호 저장
	public static int loginUserNumber = 0;
	
	// 카트 배열 리스트
	public static ArrayList<Product> carts = new ArrayList<Product>();
	
}