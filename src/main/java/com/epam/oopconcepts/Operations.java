package com.epam.oopconcepts;

public class Operations {

	public int a,b;
	public int calci(int a,int b) {
		return 0;
	}
	}
	class Sum extends Operations{
		public int calci(int a,int b) {
			return a+b;
		}
	}
	class Sub extends Operations{
		public int calci(int a,int b) {
			return a-b;
		}
	}
	class Mul extends Operations{
		public int calci(int a,int b) {
			return a*b;
		}
	}
	class Div extends Operations{
		public int calci(int a,int b) {
			if (b==0){
				return 0;
			}
			return a/b;
			
		}
	}

