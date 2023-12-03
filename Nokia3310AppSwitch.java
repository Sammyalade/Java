import java.util.Scanner;

public class Nokia3310AppSwitch{
	public static void main(String[] args){

		Scanner collector = new Scanner(System.in);
		
		System.out.print("1. Phone Book\n2. Messages\n3. Chat\n4. Call Register\n5. Tones\n6. Settings\n7. Call divert\n8. Games\n9. Calculator\n10. Reminders\n11. Clock\n12. Profiles\n13. SIM services\n\nEnter: ");
		int input1 = collector.nextInt();

		switch(input1){
			case 1:
			System.out.print("1. Search\n2. Service Nos\n3. Add Name\n4. Erase\n5. Edit\n6. Assign tone\n7. Send B' Card\n8. Options\n9. Speed Dails\n10. Voice Tag\n\nEnter: ");
			int input2 = collector.nextInt();
			switch(input2){
				case 1:
					System.out.print("\"Search\"");
					break;
				case 8:
					System.out.print("1. Type of view\n2. Memory Status\n");
			}
			break;
			case 2:
			System.out.print("1. Write Messages\n2. Inbox\n3. Outbox\n4. Picture messages\n5. Templates\n6. Smileys\n7. Messages settings\n8. Info service\n9. Voice mailbox number\n10. Service command editor\n\nEnter: ");
			int input22 = collector.nextInt();
				switch(input22){
				case 7:
				System.out.print("1. Set\n2. Common\n\n\nEnter: ");
				int input3 = collector.nextInt();
					switch(input3){
					case 1:
					System.out.print("1. Message center number\n2. Messages sent as\n3. Message validity\n\n");
					break;
					case 2:
					System.out.print("1. Delivery reports\n2. Reply via same centre\n3. Character support\n\n");
					}
				}
			break;
			case 4: 
			System.out.print("1. Missed calls\n2. Received calls\n3. Dailed calls\n4. Erase recent calls lists\n5. Show call duration\n6. Show call costs\n7. Call cost settings\n8. Prepaid credit\n\nEnter: ");
			int input222 = collector.nextInt();
				switch(input222){
				case 5:
				System.out.print("1. Last call duration\n2. All calls' duration\n3. Received calls' duration\n4. Dailed calls' duration\n5. Clear timers\n\n");
				break;
				case 6:
				System.out.print("1. Last call cost\n2. All costs' cost\n3. Clear counter\n\n");
				break;
				case 7:
				System.out.print("1. Call cost limit\n2. Show cost in\n\n");
				}
			break;
			case 5:
			System.out.print("1. Ringing tone\n2. Ringing volume\n3. Incoming call alert\n4. Composer\n5. Message alert tone\n6. Keypad tones\n7. Warning and games tone\n8. Vibrating alert\n9. Screen saver\n\n");
			break;
			case 6:
			System.out.print("1. Call settings\n2. Phone settings\n3. Security settings\n4. Restore factory settings\n\nEnter: ");
			int input2222 = collector.nextInt();
				switch(input2222){
				case 1:
				System.out.print("1. Automatic redial\n2. Speed dialling\n3. Call waiting options\n4. Own number sending\n5. Phone line in use\n6. Automatic answer\n\n");
				break;
				case 2:
				System.out.print("1. Language\n2. Cell info display\n3. Welcome note\n4. Network selection\n5. Light\n6. Confirm SIM services actions\n\n");
				break;
				case 3:
				System.out.print("1. PIN code request\n2. Call barring service\n3. Fixed dialling\n4. Closed user group\n5. Phone security\n6. Change access codes\n\n");
				break;
				}
			break;
			case 11:
			System.out.print("1. Alarm clock\n2. Clock settings\n3. Date settings\n4. Stopwatch\n5. Countdown timer\n6. Auto update of date and time\n\n");
			break;

		}
	
	}


}