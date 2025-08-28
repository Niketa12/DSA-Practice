import java.util.Arrays;

public class search_array {
    
    
    static int Searchcount(int arr[],int index,int value){
        if(index==arr.length){
            return 0;
        }
        int count=Searchcount(arr, index+1, value);
        if(arr[index]==value){
            count++;
        }
        return count;

    }

    static int[] searchOccur(int arr[],int index,int value){
        if(arr.length==index){
            int count=Searchcount(arr, 0, value);
            System.out.println(count);
            int res[]=new int[count+1];
            res[0]=count+1;
            return res;
        }
        int _res[]=searchOccur(arr, index+1, value);
        if(arr[index]==value){
            _res[_res[0]-1]=index;
            _res[0]--;
        }
        return _res;

    }



    static int searchelement(int arr[],int index,int val){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==val){
            return index;
        }
        return searchelement(arr, index+1, val);
    }
    public static void main(String[] args) {
        int arr[]={4,4,4,4,66};
        int value=4;
        int result[]=searchOccur(arr, 0, value);
        System.out.println(Arrays.toString(Arrays.copyOfRange(result,1,result.length)));
        //int index=searchelement(arr, 0, value);
        //System.out.println(index>=0?"Found":"not Found");
        //int _index=Searchcount(arr, 0, value);
        //System.out.println(_index);
        
        
        
    }
}
