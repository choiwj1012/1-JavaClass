package java_20160804_Robot;

import java.util.Scanner;

public class Main6 {
	
	public static void main(String[] args){

		final int MAX_ROBOT_COUNT = 3;
		Robot6[] robots = new Robot6[MAX_ROBOT_COUNT];
		int currentRobotCount = 0;
		
		final String PRIFIX_SN = "r_";
		
		Scanner keyboard = new Scanner(System.in);
		boolean exit = false; 
		
		// 메뉴 선택 시작
		while(!exit){
			
			System.out.println("메뉴 선택");
			System.out.println("1.로봇 생성");
			System.out.println("2.로봇 운용"); // 운용 : 걷다, 날다, 뛰다, 미사일 쏘다, 칼 휘두르다
			System.out.println("3.로봇 정보 수정");
			System.out.println("4.로봇 정보 보기");
			System.out.println("5.전체 로봇 정보 보기");
			System.out.println("6.종료");
			
			int selectedMenu = keyboard.nextInt();
			
			switch(selectedMenu){
				case 1 :
					if(currentRobotCount >= MAX_ROBOT_COUNT){
						System.out.println("더이상 생산할 수 없습니다.");
						break;
					}
					
					String currentSN = PRIFIX_SN + currentRobotCount;
					robots[currentRobotCount] = new Robot6(currentSN);
					
					System.out.println("로봇 이름 : ");
					String currentName = keyboard.next();
					robots[currentRobotCount].setName(currentName);
					
					System.out.println("로봇이 생성되었습니다");
					currentRobotCount = currentRobotCount + 1;
					break;
					
				case 2 :
					boolean stopCase2 = false;
					boolean isFind = false;
					boolean stopAction = false;
					
					while(!stopCase2){
						
						System.out.println("제품 번호 : ");
						String searchSN = keyboard.next();
						
						while(!stopAction){
							for(int i=0; i<currentRobotCount; i++){
								if(searchSN.equals(robots[i].getSn())){
									isFind = true;
									System.out.println("원하시는 행동을 선택해 주세요");
									System.out.println("1 걷기 | 2 뛰기 | 3 미사일발사 | 4 검휘두르기 | 5 종료");
									
									int chooseNum = keyboard.nextInt();
									switch(chooseNum){
										case 1 :
											System.out.print(robots[i].getSn()+" 로봇이 ");
											robots[i].actionWalk();
											break;
											
										case 2 :
											System.out.print(robots[i].getSn()+" 로봇이 ");
											robots[i].actionRun();
											break;
											
										case 3 :
											System.out.print(robots[i].getSn()+" 로봇이 ");
											robots[i].actionMissile();
											break;
											
										case 4 :
											System.out.print(robots[i].getSn()+" 로봇이 ");
											robots[i].actionKnife();
											break;
											
										case 5 :
											System.out.println(robots[i].getSn() + "로봇을 종료합니다");
											stopAction = true;
											break;
											
										default :
											System.out.println("잘못입력하셨습니다");
											
									} // case2 > switch
								} // case2 > switch > if 
							} // case2 > switch > if > for 
							
							if(!isFind){
								System.out.println("찾으시는 로봇이 없습니다.");
								break;
							}
							
						} // case2 > first while > second while		
						
						System.out.println("재운용하시겠습니까? yes or no");
						String chooseYN = keyboard.next();
						
						if(chooseYN.equals("yes") || chooseYN.equals("YES")){
							isFind = false;
							stopAction = false;
						}else if(chooseYN.equals("no") || chooseYN.equals("NO")){
							stopCase2 = true;
							break;
						}else{
							System.out.println("재입력하십시오");
						}
	
					} // case2 > first while 
					break;
					
				case 3 :
					System.out.println("제품 번호 :");
					String searchSN = keyboard.next();
					
					isFind = false;
					for(int i=0; i<currentRobotCount; i++){
						if(searchSN.equals(robots[i].getSn())){
							System.out.println("로봇 이름 : ");
							String updateName = keyboard.next();
							robots[i].setName(updateName);
							isFind = true;
							break;
						}
					} // case3 > for
					
					if(!isFind){
						System.out.println("찾으시는 로봇이 없습니다");
						continue;
					}
					
					System.out.println("로봇 정보를 수정하였습니다");
					break;
					
				case 4 :
					System.out.println("제품 번호 : ");
					searchSN = keyboard.next();
					
					isFind = false;
					for(int i=0; i<currentRobotCount; i++){
						if(searchSN.equals(robots[i].getSn())){
							System.out.println("제품 번호\t로봇 이름");
							System.out.print(robots[i].getSn()+"\t");
							System.out.println(robots[i].getName());
							isFind = true;
							break;	
						}
					} // case4 > for
					
					if(!isFind){
						System.out.println("찾으시는 로봇이 없습니다");
						continue;
					}
					
					System.out.println("로봇 정보를 표시하였습니다");
					break;
					
				case 5 :
					System.out.println("제품 번호\t로봇 이름");
					for(int i=0; i<currentRobotCount; i++){
						System.out.print(robots[i].getSn()+"\t");
						System.out.println(robots[i].getName());
					}
					System.out.println("전체 로봇 정보를 표시하였습니다");
					break;
					
				case 6 :
					System.out.println("프로그램을 종료 하는 중...");
					exit = true;
					break;
					
				default :
					System.out.println("메뉴를 다시 선택해 주세요");
					
			} // while > switch
			
		} // while
		
		System.out.println("프로그램 종료");
		keyboard.close();
		
	} // main()
	
}
