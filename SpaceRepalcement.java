package chap1;

public class SpaceRepalcement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Mr John Smith                 ";
		char[] strArr = str.toCharArray();
		System.out.println(strArr);
		int readPtr,writePtr,i,spaceCount=0;
		int trueLength=13;
		
		for(i=0;i<trueLength;i++){
			if(strArr[i]==' ')
				spaceCount++;		
		}
		
		writePtr = spaceCount*2 + trueLength-1;
		System.out.println("space count :" + spaceCount + " writePtr :" + writePtr);
		
		for(readPtr=trueLength-1;readPtr>=0;readPtr--){
			
			if(strArr[readPtr]==' '){
				strArr[writePtr--]='0';
				strArr[writePtr--]='2';
				strArr[writePtr--]='%';
				//System.out.println("in space");
			}
			
			else{
				strArr[writePtr--]=strArr[readPtr];
				//System.out.println("no space");
			}
			
			System.out.println(strArr);
		}
		
		System.out.println(strArr);
		

	}

}
