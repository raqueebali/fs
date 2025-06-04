/*
For X-Mas, santa claus is preparing a X-Mas Tree with set of Bulbs.
The bulbs are of different voltages, and preparation of tree as follows:
	- The bulbs are arranged in level-wise, levels are numbered from 0,1,2,3..
	  so on.
	- At level-0: There will be only one bulb as root bulb.,
	- From next level onwards, we can attach atmost two bulbs, one is to left side
	  and/or the other is to right side of every bulb in previous level.
	- The empty attachements in a level are indicated with -1. 
	(for example: look in hint)
		
You will be given the X-Mas Tree root,
Your task is to findout the average of each level of the X-Mas tree, starts from level-0.

Implement the class Solution.
1.public boolean isXmasTree(BinaryTreeNode root): returns a boolean value.


Input Format:
-------------
A single line of space separated integers, voltages of the set of bulbs.

Output Format:
--------------
Print a list of double values (averages of each level)



Sample Input-1:
---------------
3 8 4 3 5 -1 7 

Sample Output-1:
----------------
[3.0, 6.0, 5.0]


Sample Input-2:
---------------
3 8 4 3 5 7 7 

Sample Output-2:
----------------
[3.0, 6.0, 5.5]



=== test cases ===
case =1
input =3 8 4 3 5 -1 7 
output =[3.0, 6.0, 5.0]

case =2
input =3 8 4 3 5 7 7
output =[3.0, 6.0, 5.5]

case =3
input =11 8 6 1 7 5 16 3 20 18 14 22 10 4 2 17 15 19 12
output =[11.0, 7.0, 7.25, 11.625, 15.75]

case =4
input =1 10 4 3 -1 7 9 12 8 6 -1 -1 2
output =[1.0, 7.0, 6.333333333333333, 7.333333333333333]

case =5
input =1 3 5 7 -1 -1 9 8 -1 -1 -1 -1 -1 -1 6 10 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 13
output =[1.0, 4.0, 8.0, 7.0, 11.5]

case =6
input =11 99 88 77 -1 -1 66 55 -1 -1 -1 -1 -1 -1 44 33 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 22
output =[11.0, 93.5, 71.5, 49.5, 27.5]

case =7
input =11 8 6 1 3 9 11 30 20 18 16 12 10 4 2 17
output =[11.0, 7.0, 6.0, 14.0, 17.0]

case =8
input =1 4 2 3 -1 -1 5 6 -1 -1 -1 -1 -1 -1 4 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 7
output =[1.0, 3.0, 4.0, 5.0, 6.0]

*/
import java.util.*;

class BinaryTreeNode
{
	public int data; 
	public BinaryTreeNode left, right; 
	public BinaryTreeNode(int data)
	{
		this.data = data; 
		left = null; 
		right = null; 
	}
}

class Solution 
{
	public List<Double> averageOfLevels(BinaryTreeNode root)
	 {
		List<Double> result = new ArrayList<>();
		Queue<BinaryTreeNode> q = new LinkedList<>();
		
		if(root == null||root.data==-1) return result;
		q.add(root);
		while(!q.isEmpty()) {
			int n = q.size();
			double sum = 0.0;
			for(int i = 0; i < n; i++) {
				BinaryTreeNode node = q.poll();
				sum += node.data;
				if(node.left != null && node.left.data!=-1) q.offer(node.left);
				if(node.right != null && node.right.data!=-1) q.offer(node.right);
			}
			result.add(sum / n);
		}
		return result;
	}
}

public class AvgOfLvlsBT
{
	static BinaryTreeNode root;
	static BinaryTreeNode temp = root;
	void insert(BinaryTreeNode temp, int key)
    {
 
        if (temp == null) 
		{
            root = new BinaryTreeNode(key);
            return;
        }
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(temp);
 
        // Do level order traversal until we find an empty place.
        while (!q.isEmpty()) 
		{
            temp = q.peek();
            q.remove();
 
            if (temp.left == null)
			 {
                temp.left = new BinaryTreeNode(key);
                break;
            }
            else
                q.add(temp.left);
 
            if (temp.right == null) 
			{
                temp.right = new BinaryTreeNode(key);
                break;
            }
            else
                q.add(temp.right);
        }
    }
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str[]=sc.nextLine().split(" ");
		AvgOfLvlsBT st=new AvgOfLvlsBT();

		root=new BinaryTreeNode(Integer.parseInt(str[0]));

		for(int i=1; i<str.length; i++)
			st.roinsert(t,Integer.parseInt(str[i]));
		Solution sol= new Solution();
		System.out.println(sol.averageOfLevels(root));
	}
}

	