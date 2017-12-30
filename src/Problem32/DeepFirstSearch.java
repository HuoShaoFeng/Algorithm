package Problem32;

public class DeepFirstSearch {

        /** 
         * ��ȱ��� 
         * DFSearch 
         * @param node ��ǰ�ڵ� 
         * @param visited �����ʹ��Ľڵ��б�
         */  
        public void searchTraversing(GraphNode node, List<GraphNode> visited) {  
            // ���������  
            if (visited.contains(node)) {  
                return;  
            }  
              
            visited.add(node);  //��� ��������
            System.out.println("�ڵ㣺" + node.getLabel());  
            for (int i = 0; i < node.edgeList.size(); i++) {  
                searchTraversing(node.edgeList.get(i).getNodeRight(), visited);  
            }  
        }  
}
