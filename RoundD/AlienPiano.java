package kickstart2020roundD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlienPiano {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int i;
		for (i=0; i<T; i++){
		    int K = Integer.parseInt(br.readLine());
		    int[] A = new int[K];
		    int j;
		    int Y=0;
		    StringTokenizer st = new StringTokenizer(br.readLine());
		    for(j=0; j<K; j++){
		        A[j] = Integer.parseInt(st.nextToken());
		    }
		    int upCount = 0;
		    int downCount = 0;
		    for(j=0; j<K-1; j++) {
		    	if(A[j]<A[j+1]) {
		    		upCount++;
		    		downCount=0;
		    	}
		    	else if(A[j]>A[j+1]) {
		    	    upCount=0;
		    		downCount++;
		    	}
		    	if(upCount>3||downCount>3) {
		    		Y++;
		    		upCount=0;
		    		downCount=0;
		    	}
		    }
		    System.out.printf("Case #%d: %d\n", i+1, Y);
		}
    }
}