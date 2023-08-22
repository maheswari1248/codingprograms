package sorting;

public class binarysearch {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int low=0;
		int high=a.length-1;
		int mid;
		int search=2;
		while(low<=high) {
			mid=(low +high)/2;
			if(a[mid]<search) {
				low=mid+1;
			}
			else if(a[mid]>search) {
				high=mid-1;
			}
			else {
				System.out.println("element found hurahh");
				break;
			}
			
		}
		if(low>high) {
			System.out.println("element not found ");
		}
	}

}
