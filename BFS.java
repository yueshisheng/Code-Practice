package datastructure;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;



public class BFS {
	public static void main(String [] args) {
		LinkedList<Character> ls=new LinkedList<Character>();
		ls.add('w');
		ls.add('r');
		LinkedList<Character> lw=new LinkedList<Character>();
		lw.add('s');
		lw.add('i');
		lw.add('x');
		LinkedList<Character> lr=new LinkedList<Character>();
		lr.add('s');
		lr.add('v');
		LinkedList<Character> lx=new LinkedList<Character>();
		lx.add('w');
		lx.add('i');
		lx.add('u');
		lx.add('y');
		LinkedList<Character> lv=new LinkedList<Character>();
		lv.add('r');
		LinkedList<Character> li=new LinkedList<Character>();
		li.add('u');
		li.add('x');
		li.add('w');
		LinkedList<Character> lu=new LinkedList<Character>();
		lu.add('i');
		lu.add('x');
		lu.add('y');
		LinkedList<Character> ly=new LinkedList<Character>();
		ly.add('u');
		ly.add('x');
		HashMap<Character,LinkedList<Character>> hs=new HashMap<Character,LinkedList<Character>>();
		hs.put('s', ls);
		hs.put('w', lw);
		hs.put('r', lr);
		hs.put('x', lx);
		hs.put('v', lv);
		hs.put('i', li);
		hs.put('u', lu);
		hs.put('y', ly);
		char start='s';
		HashMap<Character,Integer> dist=new HashMap<Character,Integer>();
		BFS(start,hs,dist);
	}
	public static void BFS(char start,HashMap<Character,LinkedList<Character>> hs,HashMap<Character,Integer> dist) {
		Queue<Character> q=new LinkedList();
		q.add(start);
		dist.put(start, 0);
		int i=0;
		while(!q.isEmpty()) {
			char top=q.poll();
			System.out.println("第"+i+"元素"+top+"元素到s距离="+dist.get(top));
			i++;
			int d=dist.get(top)+1;
			for(Character c:hs.get(top)) {
				if(!dist.containsKey(c)) {
					dist.put(c, d);
					q.add(c);
				}
			}
			
			
		}
		
		
	}

}
