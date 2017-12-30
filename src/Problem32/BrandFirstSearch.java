package Problem32;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BrandFirstSearch {
    
  /** 
   * ����������� 
   * BFSearch 
   * @param node ��������ڽڵ�
   */  
  public void searchTraversing(GraphNode node) {  
      List<GraphNode> visited = new ArrayList<GraphNode>(); // �Ѿ������ʹ���Ԫ��  
      Queue<GraphNode> q = new LinkedList<GraphNode>(); // �ö��д������Ҫ������Ԫ��  
      q.offer(node);  
        
      while (!q.isEmpty()) {  
          GraphNode currNode = q.poll();  
          if (!visited.contains(currNode)) {  
              visited.add(currNode);  
              System.out.println("�ڵ㣺" + currNode.getLabel());  
              for (int i = 0; i < currNode.edgeList.size(); i++) {  
                  q.offer(currNode.edgeList.get(i).getNodeRight());  
              }  
          }  
      }  
  }  

}
