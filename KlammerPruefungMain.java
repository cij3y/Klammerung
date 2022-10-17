package KlammerPruefung;

import java.util.Stack;

public class KlammerPruefungMain {

	public static void main(String[] args) {
		
		// Aufgabenteil a:
		
		//String code = "{[abcd]}";
		String code = "if(a < b && b > c){"
					+"System.out.println(fail())"
					+"}";
		Stack<String> stack = new Stack<>();
								
		char[] codePositionArray = code.toCharArray();
		int open = 0;
		int close = 0;
		
		for(int codePosition = 0; codePosition < codePositionArray.length; codePosition++) {
			char character = codePositionArray[codePosition];
			int ascii = (int)character;
			
			if(ascii == 40) {
				stack.push("(");
				open += 1;
			}else if(ascii == 123){
				stack.push("{");
				open += 1;
			}else if(ascii == 91) {
				stack.push("[");
				open += 1;
			}else if(ascii == 60) {
				stack.push("<");
				open += 1;
			}
		}
		
		//System.out.println("stack: " + stack);
		
		for(int codePosition = 0; codePosition < codePositionArray.length; codePosition++) {
			char character = codePositionArray[codePosition];
			int ascii = (int)character;
			
			if(ascii == 41 || ascii == 125 || ascii == 93 || ascii == 62) {
				close += 1;
			}
		}
		
		for(int codePosition = 0; codePosition < codePositionArray.length; codePosition++) {
			char character = codePositionArray[codePosition];
			int ascii = (int)character;
			
			if(stack.isEmpty() == true) {
				break;
			}else {
				if(ascii == 41) {
					stack.pop();
				}else if(ascii == 125) {
					stack.pop();
				}else if(ascii == 93) {
					stack.pop();
				}else if(ascii == 62) {
					stack.pop();
				}
			}
		}
		
		//System.out.println("stack: " + stack);
		
		if(stack.isEmpty() == true && open == close) {
			System.out.println("Der Quelltext ist korrekt geklammert");
		}else if(stack.isEmpty() != true || close != open) {
			System.out.println("Der Quelltext ist nicht korrekt geklammert");
		}
	
	
	// Aufgabenteil b:
	// In den Codezeilen 93, 111 und 121 wurde das Zeichen "<" auch als Strings gekennzeichnet und weil es 3 mal in dem Code vorkommt und so zu einer negativen Auswertung des Program führt
		
		//String code2 = "(q)\"shalala in the morning\"[qqq]";
		String code2 = "package tae;"
			+ "import java.util.Stack;"
			+ "public class Tae {"
			+ "	public static void main(String[] args) {"
			+ "	//a"
			+ "String code = \"{[abcd]}\";"
			+ "Stack<String> stack = new Stack<String>();"
			+ "char[] codePositionArray = code.toCharArray();"
			+ "int open = 0;"
			+ "int close = 0;"
			+ "for(int codePosition = 0; codePosition \"<\" codePositionArray.length; codePosition++) {"
			+ "char character = codePositionArray[codePosition];"
			+ "int ascii = (int)character;"
			+ "if(ascii == 40) {"
			+ "stack.push(\"(\");"
			+ "open += 1;"
			+ "}else if(ascii == 123){"
			+ "stack.push(\"{\");"
			+ "open += 1;"
			+ "}else if(ascii == 91) {"
			+ "stack.push(\"[\");"
			+ "open += 1;"
			+ "}else if(ascii == 60) {"
			+ "stack.push(\"<\");"
			+ "open += 1;"
			+ "}"
			+ "}"
			+ "//System.out.println(\"stack:\" + stack);"
			+ "for(int codePosition = 0; codePosition \"<\" codePositionArray.length; codePosition++) {"
			+ "char character = codePositionArray[codePosition];"
			+ "int ascii = (int)character;"
			+ "if(ascii == 41 || ascii == 125 || ascii == 93 || ascii == 62) {"
			+ "close += 1;"
			+ "}"
			+ "}"
			+ "if(close != open) {"
			+ "fail();"
			+ "}"
			+ "for(int codePosition = 0; codePosition \"<\" codePositionArray.length; codePosition++) {"
			+ "char character = codePositionArray[codePosition];"
			+ "int ascii = (int)character;"
			+ "if(stack.isEmpty() == true) {"
			+ "break;"
			+ "}else {"
			+ "if(ascii == 41) {"
			+ "stack.pop();"
			+ "}else if(ascii == 125) {"
			+ "stack.pop();"
			+ "}else if(ascii == 93) {"
			+ "stack.pop();"
			+ "}else if(ascii == 62) {"
			+ "stack.pop();"
			+ "}"
			+ "}"
			+ "}"
			+ "if(stack.isEmpty() == true && open == close) {"
			+ "System.out.println(\"Der Quelltext ist korrekt geklammert\");"
			+ "}"
			+ "//System.out.println(\"stack2:\" + stack);"
			+ "}"
			+ "public static void fail() {"
			+ "System.out.println(\"Der Quelltext ist nicht korrekt geklammert\");"
			+ "}"
			+ "}"; 
	
		Stack<String> stack2 = new Stack<>();
		Stack<Integer> megaStack = new Stack<>();
									
		char[] codePositionArray2 = code2.toCharArray();
		int open2 = 0;
		int close2 = 0;
		
		//System.out.println(codePositionArray2);
					
		for(int codePosition2 = 0; codePosition2 < codePositionArray2.length; codePosition2++) {
			char character2 = codePositionArray2[codePosition2];
			int ascii2 = (int)character2;
			
			if(ascii2 == 39 && megaStack.isEmpty() == true) {
				megaStack.push(1);
			}else if(ascii2 == 34 && megaStack.isEmpty() == true) {
				megaStack.push(1);
			}else if(ascii2 == 34 && megaStack.isEmpty() == false) {
				megaStack.pop();
			}else if(ascii2 == 39 && megaStack.isEmpty() == false) {
				megaStack.pop();
			}else if(megaStack.isEmpty() == true){
				if(ascii2 == 40){
					stack2.push("(");
					//open2 += 1;
				}else if(ascii2 == 123){
					stack2.push("{");
					//open2 += 1;
				}else if(ascii2 == 91) {
					stack2.push("[");
					//open2 += 1;
				}else if(ascii2 == 60) {
					stack2.push("<");
					//open2 += 1;
				}
			}
		}
	
		//System.out.println("stack2: " + stack2);
				
		if(close2 != open2) {
			System.out.println("Der Quelltext 2 ist nicht korrekt geklammert");
		}
				
		for(int codePosition2 = 0; codePosition2 < codePositionArray2.length; codePosition2++) {
			char character2 = codePositionArray2[codePosition2];
			int ascii2 = (int)character2;
			
			if(stack2.isEmpty() == true) {
				break;
			}else {
				if(ascii2 == 41) {
					stack2.pop();
				}else if(ascii2 == 125) {
					stack2.pop();
				}else if(ascii2 == 93) {
					stack2.pop();
				}else if(ascii2 == 62) {
					stack2.pop();
				}
			}
		}
	
		//System.out.println("stack2: " + stack2);
				
		if(stack2.isEmpty() == true) {
			System.out.println("Der Quelltext 2 ist korrekt geklammert");
		}else {
			System.out.println("Der Quelltext 2 ist nicht korrekt geklammert");
		}
	}
}




