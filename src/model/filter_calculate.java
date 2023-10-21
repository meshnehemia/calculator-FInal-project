package model;

public class filter_calculate {
	private String fil_string;
	private char [] fil_char;
	private String [] filterdArray;
	private Calculate ans;
	public filter_calculate(){
		filterdArray = new String[100];
		ans = new Calculate();
	}
	public String filter(String numbers) {
		fil_string =numbers;
		String temp="";
		int j=0;
		fil_char =fil_string.toCharArray();
		for(int i=0;i<fil_char.length;i++) {
			if(fil_char[i]=='*'||fil_char[i]=='/'||fil_char[i]=='+'||
				fil_char[i]=='-'||fil_char[i]=='p'||fil_char[i]=='s'||
				fil_char[i]=='t'||fil_char[i]=='~'||fil_char[i]=='^'||fil_char[i]=='c') {
				if(temp!="") {
				filterdArray[j]=temp;
				temp="";
				j++;}
				filterdArray[j]=Character.toString(fil_char[i]);
				j++;
				
			}else {
				temp +=fil_char[i];
				
			}
		}
		filterdArray[j]=temp;
		for(int i =0;i<filterdArray.length;i++)
		{
			if(filterdArray[i]!=null);
		}
		return compare();
	}
	private String compare() {
		double answer=0;
		try {
		answer=Double.parseDouble(filterdArray[0]);
		}catch(Exception e) {
			answer =0;
		}
		String tempo="z";
		try {
		for(int i =0;i<filterdArray.length;i++)
		{
			for(int j =0;j<filterdArray.length;j++)
			{
				tempo = filterdArray[j];
				if(tempo==null) {
					tempo="z";}
				switch(tempo) {
				case "^":{
					answer =ans.sq(Double.parseDouble(filterdArray[j-1]));
					filterdArray[j-1]= Double.toString(answer);
					filterdArray[j]=Double.toString(answer);
				}}
			}
			for(int j =0;j<filterdArray.length;j++)
			{
				tempo = filterdArray[j];
				if(tempo==null) {
					tempo="z";}
				switch(tempo) {
				case "~":{
					answer =ans.sqrt(Double.parseDouble(filterdArray[j+1]));
					filterdArray[j]=Double.toString(answer);
					filterdArray[j+1]=Double.toString(answer);
				}}
			}
			for(int j =0;j<filterdArray.length;j++)
			{
				tempo = filterdArray[j];
				if(tempo==null) {
					tempo="z";}
				switch(tempo) {
				case "s":{
					answer =ans.sin(Double.parseDouble(filterdArray[j+1]));
					filterdArray[j]=Double.toString(answer);
					filterdArray[j+1]=Double.toString(answer);
				}}
			}
			for(int j =0;j<filterdArray.length;j++)
			{
				tempo = filterdArray[j];
				if(tempo==null) {
					tempo="z";}
				switch(tempo) {
				case "c":{
					answer =ans.cos(Double.parseDouble(filterdArray[j+1]));
					filterdArray[j]=Double.toString(answer);
					filterdArray[j+1]=Double.toString(answer);
				}}
			}
			for(int j =0;j<filterdArray.length;j++)
			{
				tempo = filterdArray[j];
				if(tempo==null) {
					tempo="z";}
				switch(tempo) {
				case "t":{
					answer =ans.tan(Double.parseDouble(filterdArray[j+1]));
					filterdArray[j]=Double.toString(answer);
					filterdArray[j+1]=Double.toString(answer);
				}}
			}
			for(int j =0;j<filterdArray.length;j++)
			{
				tempo = filterdArray[j];
				if(tempo==null) {
					tempo="z";}
				switch(tempo) {
				case "p":{
					answer =ans.power(Double.parseDouble(filterdArray[j-1]), Double.parseDouble(filterdArray[j+1]));
					filterdArray[j-1]= Double.toString(answer);
					filterdArray[j]=Double.toString(answer);
					filterdArray[j+1]=Double.toString(answer);
				}}
			}
			for(int j =0;j<filterdArray.length;j++)
			{
				tempo = filterdArray[j];
				if(tempo==null) {
					tempo="z";}
				switch(tempo) {
					case "/":{
						answer = ans.devide(Double.parseDouble(filterdArray[j-1]), Double.parseDouble(filterdArray[j+1]));
						filterdArray[j-1]= Double.toString(answer);
						filterdArray[j]=Double.toString(answer);
						filterdArray[j+1]=Double.toString(answer);
						break;
					}
				}
					
				}
			for(int j =0;j<filterdArray.length;j++)
			{
				tempo = filterdArray[j];
				if(tempo==null) {
					tempo="z";}
				switch(tempo) {
				case "*":{
					answer =ans.multiply(Double.parseDouble(filterdArray[j-1]), Double.parseDouble(filterdArray[j+1]));
					filterdArray[j-1]= Double.toString(answer);
					filterdArray[j]=Double.toString(answer);
					filterdArray[j+1]=Double.toString(answer);
					break;
				}
				}
			}
			for(int j =0;j<filterdArray.length;j++)
			{
				tempo = filterdArray[j];
				if(tempo==null) {
					tempo="z";}
				switch(tempo) {
				case "+":{
					answer =ans.add(Double.parseDouble(filterdArray[j-1]), Double.parseDouble(filterdArray[j+1]));
					filterdArray[j-1]= Double.toString(answer);
					filterdArray[j]=Double.toString(answer);
					filterdArray[j+1]=Double.toString(answer);
				}}
			}
			for(int j =0;j<filterdArray.length;j++)
			{
				tempo = filterdArray[j];
				if(tempo==null) {
					tempo="z";}
				switch(tempo) {
				case "-":{
					answer =ans.subtract(Double.parseDouble(filterdArray[j-1]), Double.parseDouble(filterdArray[j+1]));
					filterdArray[j-1]= Double.toString(answer);
					filterdArray[j]=Double.toString(answer);
					filterdArray[j+1]=Double.toString(answer);
				}}
			}
			return Double.toString(answer);
		}
		}catch(Exception e) {
			return "error";
		}
		return Double.toString(answer);
	}
}
