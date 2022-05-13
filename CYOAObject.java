
public class CYOAObject {
	
	private String name = null;
	
	public CYOAObject(String pp) {
		name = pp;
	}
	
	public String background() {
		return name + ", have been summoned to the land of Lezandria, where the king has called you forth to break a prophecy that his only daughter would be stolen away from him by\na vile demon, in this demon’s attempt to take over ruling the nation.\n";
	}
	
	public String scenario1() {
		return "The court has given you time to rest and recover from the process of being summoned to this land. Now that you feel better and are adequately clothed and fed,\nwould you like to-\n"
				+ 1 + ": Speak to the princess?\n"
				+ 2 + ": Speak to the king?\n";
	}
		public String scenario1Option1() {
			return "The princess warns you of the king's hasty decision making and absolute belief that everyone should live up to his expectations of them.\n"
					+ 1 + ": “ Can I live up to your expectations princess?” (Seduce her)\n"
					+ 2 + ": Go to speak to the king.\n";
		}
			public String scenario1Option1Cont() {
				return "The guards have come to investigate the screaming, and have arrested you for defiling the princess, you are taken to the king who believes that you are the prophesied demon,\nto break the prophecy you are set to be executed in mere hours. The prophecy still happens and the princess gets stolen away in days.\n";
			}
		public String scenario1Option2() {
			return "You approach the king, he tells you the details of your quest, in that you must go far to the South, to the land of demons and kill all who inhabit the area.\n"
					+ 1 + ": Agree to take the kings quest and set off.\n"
					+ 2 + ": Prod the king for further details.\n";
		}
			public String scenario1Option2Cont() {
				return "The king upon seeing you hesitate to follow his command, has you imprisoned before you can utter the first word of your question,\nyou are set to be executed in mere hours for treason.\n";
			}
			
	public String scenario2() {
		return "Now that you have your goal in mind and have left the castle. Would you like to search for a beginner quest to test your skills\nor would you rather head South to go directly into demon territory?\n"
				+ 1 + ": Search for a beginner quest.\n"
				+ 2 + ": Head straight South to accomplish the king's task.\n";
	}
	
	public String scenario3() {
		return "On your search for a more introductory quest to test your skills and maybe earn some money since it seems like it’ll be quite\nsome time before you can return to your own world. You stumble upon an inn with a job board what job would you like to do?\n"
				+ 1 + ": Clear a goblin hole\n"
				+ 2 + ": Investigate a young woman's stalker\n"
				+ 3 + ": Assist an eldery woman with her grocery shopping\n"
				+ 4 + ": Give up on finding another job and head South\n";
	}
		public String scenario3Option1() {
			return "You enter the goblin hole completely unprepared to fight the droves of goblins hiding inside and die.\n";
		}
		public String scenario3Option2() {
			return "You successfully find this young woman’s stalker however quite to your own surprise he’s not just a stalker but a murderer and tries to kill you,\nyou manage to fight him off and even mortally wound him without getting too injured yourself. You’ve been given 50 gold by the woman.\n"
					+ "\n The king hears that you’ve been delaying heading into the demon territory and has decided that summoning another hero will be fine,\nand has had you imprisoned for treason, you are set to be executed in mere hours.\n";
		}
		public String scenario3Option3() {
			return " You successfully assist the elderly woman with her shopping, she thanks you quite earnestly however she has no money to give you.\n"
					+ "\n The king hears that you’ve been delaying heading into the demon territory and has decided that summoning another hero will be fine,\nand has had you imprisoned for treason, you are set to be executed in mere hours.\n";
		}
	
	public String scenario4() {
		return "You begin leaving the city and see 3 different paths that all seem to lead South. Which path would you like to take?\n"
				+ 1 + ": The path that goes along some of the farmlands.\n"
				+ 2 + ": The path that goes through the woods.\n"
				+ 3 + ": The path leading over the bridge.\n";
	}
		public String scenario4Option1() {
			return "You go along the farmlands and successfully make it South to the border of the demon territory.\n";
		}
		public String scenario4Option2() {
			return "As you enter the woods you hear a howl in the distance, unfortunately unknown to you these woods aren’t supposed to be traveled\nbecause a pack of raging wolves have eaten all the prey animals but cannot leave the woods in search of more food.\n"
					+ "\nYou’re horrifically mauled by the pack of ravenous wolves.";
		}
		public String scenario4Option3() {
			return " As you’re reaching the center point of the bridge you feel something grab your ankle, these waters are protected by a water spirit\nthat has become mad with how the king has been exploiting the waters.\n"
					+ "\nYou are dragged into the river and drowned by the spirit.";
		}
		
	public String scenario5() {
		return " Now that you’ve reached the border of the demon territory how would you like to proceed?\n"
				+ 1 + ": Try yelling and seeing if any of the demons will come to meet you.\n"
				+ 2 + ": Charge directly into the demon’s territory in an attempt to accomplish the kings task of killing all the inhabitants.\n";
	}
		public String scenario5Option1() {
			return "An elderly demon with broken horns comes to the border to meet you, he explains that the king has been sending mad men to try and kill them for a hundred years.\nWhile all they’ve tried to do is live peacefully. He even asks if you’d like to stay at his home for a while since you’re the first sane human that’s come to meet them since this began.\n"
					+ 1 + ": Explain the prophecy the king had told you.\n"
					+ 2 + ": Attempt to kill the kind elderly demon man.\n";
		}
			public String scenario5Option1Cont1() {
				return "He responds that they had never heard of any such thing, this time however upon seeing the\nremorse in your eyes explaining what you’d come to do, leads you to his house.\n"
						+ "Once at his house he explains that the king may no longer allow to go back to the city,\nbut you’re welcome to stay and live with the demons for as long as you’d like.\n";
			}
			public String scenario5Option1Cont2() {
				return "When you attempt to swing your sword at the demon man, he dodges backwards and lets out a cry.\nWith this cry you see 5 demons who appear to be warriors charging towards you.\nThey kill you immediately and without hesitation.\n";
			}
		public String scenario5Option2() {
				return "Unfortunately the demons seemed to be prepared for you, as upon entering the first house you saw, you came face to face with 5 of their warriors.\n"
						+ "Who immediately and without remorse, murder you where you stand.\n";
			}
}