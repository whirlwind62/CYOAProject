import java.util.*;
public class TesterClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean con = true;
		
		while(con == true) {
			
			System.out.println("Player before we begin, we must start with who you are; what is your name?\n");
			String name = scan.next();
			CYOAObject story = new CYOAObject(name);
			
			System.out.println(story.background());
			
			System.out.println(story.scenario1());
			if(scan.nextInt() == 1) {
				System.out.println(story.scenario1Option1());
				if(scan.nextInt() == 1) {
					System.out.println(story.scenario1Option1Cont());
					
				} else {
					System.out.println(story.scenario1Option2());
					if(scan.nextInt() == 1) {
						System.out.println(story.scenario2());
						//Past Scenario 2
						if(scan.nextInt() == 1) {
							System.out.println(story.scenario3());
							if(scan.nextInt() == 1) {
								System.out.println(story.scenario3Option1());
							} else if(scan.nextInt() == 2) {
								System.out.println(story.scenario3Option2());
							} else if(scan.nextInt() == 3) {
								System.out.println(story.scenario3Option3());
							} else {
								System.out.println(story.scenario4());
								
								if(scan.nextInt() == 1) {
									System.out.println(story.scenario4Option1());
									
									System.out.println(story.scenario5());
									if(scan.nextInt() == 1) {
										System.out.println(story.scenario5Option1());
										if(scan.nextInt() == 1) {
											System.out.println(story.scenario5Option1Cont1());
										} else {
											System.out.println(story.scenario5Option1Cont2());
										}
									} else {
										System.out.println(story.scenario5Option2());
									}
									
								} else if(scan.nextInt() == 2) {
									System.out.println(story.scenario4Option2());
								} else {
									System.out.println(story.scenario4Option3());
								}
							}
						} else {
							System.out.println(story.scenario4());
							
							if(scan.nextInt() == 1) {
								System.out.println(story.scenario4Option1());
								
								System.out.println(story.scenario5());
								if(scan.nextInt() == 1) {
									System.out.println(story.scenario5Option1());
									if(scan.nextInt() == 1) {
										System.out.println(story.scenario5Option1Cont1());
									} else {
										System.out.println(story.scenario5Option1Cont2());
									}
								} else {
									System.out.println(story.scenario5Option2());
								}
								
							} else if(scan.nextInt() == 2) {
								System.out.println(story.scenario4Option2());
							} else {
								System.out.println(story.scenario4Option3());
							}
						}
						//end
					} else {
						System.out.println(story.scenario1Option2Cont());
					}
				}
			} else {
				System.out.println(story.scenario1Option2());
				if(scan.nextInt() == 1) {
					System.out.println(story.scenario2());
					//Copy Paste EVERYTHING from between the other comments
					if(scan.nextInt() == 1) {
						System.out.println(story.scenario3());
						if(scan.nextInt() == 1) {
							System.out.println(story.scenario3Option1());
						} else if(scan.nextInt() == 2) {
							System.out.println(story.scenario3Option2());
						} else if(scan.nextInt() == 3) {
							System.out.println(story.scenario3Option3());
						} else {
							System.out.println(story.scenario4());
							
							if(scan.nextInt() == 1) {
								System.out.println(story.scenario4Option1());
								
								System.out.println(story.scenario5());
								if(scan.nextInt() == 1) {
									System.out.println(story.scenario5Option1());
									if(scan.nextInt() == 1) {
										System.out.println(story.scenario5Option1Cont1());
									} else {
										System.out.println(story.scenario5Option1Cont2());
									}
								} else {
									System.out.println(story.scenario5Option2());
								}
								
							} else if(scan.nextInt() == 2) {
								System.out.println(story.scenario4Option2());
							} else {
								System.out.println(story.scenario4Option3());
							}
						}
					} else {
						System.out.println(story.scenario4());
						
						if(scan.nextInt() == 1) {
							System.out.println(story.scenario4Option1());
							
							System.out.println(story.scenario5());
							if(scan.nextInt() == 1) {
								System.out.println(story.scenario5Option1());
								if(scan.nextInt() == 1) {
									System.out.println(story.scenario5Option1Cont1());
								} else {
									System.out.println(story.scenario5Option1Cont2());
								}
							} else {
								System.out.println(story.scenario5Option2());
							}
							
						} else if(scan.nextInt() == 2) {
							System.out.println(story.scenario4Option2());
						} else {
							System.out.println(story.scenario4Option3());
						}
					}
					
				} else {
					System.out.println(story.scenario1Option2Cont());
				}
			}
		
			System.out.println("Would you like to play again? (q to quit, any button to continue)");
			if(scan.next().toLowerCase().equals("q")) {
				con = false;
			}
		System.out.println("ADIOS");
		scan.close();
		}
	}
}	
