package r1995.euro.sw.p5603;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	public static HashMap<HashMap<Integer, HashSet<Integer>>, ArrayList<Integer>> cache;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		for (int ç = 0; ç < cases; ç++) {
			int v = in.nextInt();
			int e = in.nextInt();
			HashMap<Integer, HashSet<Integer>> graph;
			graph = new HashMap<Integer, HashSet<Integer>>();
			for (int i = 1; i <= v; i++) {
				graph.put(i, new HashSet<Integer>());
			}
			cache = new HashMap<HashMap<Integer, HashSet<Integer>>, ArrayList<Integer>>();
			
			
			for (int i = 0; i < e; i++) {
				int from = in.nextInt();
				int to = in.nextInt();
				HashSet<Integer> g1 = graph.get(from);
				g1.add(to);
				HashSet<Integer> g2 = graph.get(to);
				g2.add(from);
			}
			ArrayList<Integer> verts = findMax(graph);
			
			Integer[] output = verts.toArray(new Integer[0]);
			Arrays.sort(output);
			System.out.println(verts.size());
			System.out.println(Arrays.toString(output).replaceAll("[\\[,\\]]", ""));
		}
	}

	
	public static ArrayList<Integer> findMax(HashMap<Integer, HashSet<Integer>> graph) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if (graph.size() == 0) {
			return result;
		}
		
		if (graph.size() == 1) {
			result.addAll(graph.keySet());
			return result;
		}
		
		if (cache.containsKey(graph)) {
			return cache.get(graph);
		}
		
		int max_size = -1;
		
		for (Integer v : graph.keySet()) {
			ArrayList<Integer> toRemove = new ArrayList<Integer>();
			HashMap<Integer, HashSet<Integer>> c;
			c = new HashMap<Integer, HashSet<Integer>>();
			ArrayList<Integer> tmp_result = new ArrayList<Integer>();
			toRemove.add(v);
			tmp_result.add(v);
			toRemove.addAll(graph.get(v));
			
			for (Integer v1 : graph.keySet()) {
				if (!toRemove.contains(v1)) {
					HashSet<Integer> nn = (HashSet<Integer>) graph.get(v1).clone();
					nn.removeAll(toRemove);
					c.put(v1, nn);
				}
			}
			
			tmp_result.addAll(findMax(c));
			
			if (tmp_result.size() > max_size) {
				max_size = tmp_result.size();
				result = (ArrayList<Integer>) tmp_result.clone();
			}
		}
		
		cache.put(graph, result);
		
		return result;
	}
}
