public class GraphOfCities{
    
    String[] cities;
    int[][] dist;

    /* Zero Paramater Constructor */
    GraphOfCities(){
        cities = new String[10];
        dist = new int[10][10];
    }
    
    /* Array Pass in Constructor */
    graphOfCiteis(String[] cities, int[][]dist){
        this.cities = cities;
        this.dist = dist;
    }

    /* Methods */
    public void getSize(){
        String rString = "";
        int cityCount = cities.length;
        int edgeCount = 0;

        for(int i = 0; i<cities.length; i++){
            for(int j = i; j < cities.length;j++){
                if(dist[i][j]!=0){
                    edgeCount++;
                }
            }
        }
        System.out.printf("There are %1$d vertices and %2$d edges in this graph.",cityCount, edgecount);
    }

    public String getNeighbor(String cName){
        int cIndex = 0;
        String rStr = "";           //rStr == Return String

        for(int i = 0; i< cities.length; i++){
            if(cName == cities[i])
            cIndex = i;
            break;
        }

        for(int i = 0; i<cities.length; i++){
            if(i != cIndex && dist[i][cIndex] != 0){
                rStr = rStr + cities[i];
            }
        }
    }

    public int getDegree(String cName){
        int cInded = 0;
        int degree = 0;

        for(int i = 0; i< cities.length; i++){
            if(cName == cities[i])
            cIndex = i;
            break;
        }
        for int i = 0; i < cities.length; i++){
            if (i != cIndex && dist[i][Cindex] != 0){
                degree++
            }
        }
        return degree;
    }

    public boolean isEmpty(){
        rVal = false                             //rVal == Return Value
        for(int i = 0; i < cities.length; i++){
            if(cities[i]!=null){
                rVal = true;
                break;
            }
        }
        return rVal;
    }

    public void addVertex(String city){
        boolean full = false;

        for(int i = 0; i<cities.length; i++){
            if(cities[i] == null || cities[i] == ""){
                cities[i] = city;
                full = false;
                break;
            }
            full = true;
        }

        if(full){
            String tempCities[] = new String[cities.lenght+1];

            for(int i = 0; i<tempCities.length; i++){
                if(i=cities.length){
                    tempCities[i] = city;
                }
                else{
                    temCities[i]=cities[i];
                }
            }

        }
    }

    public int addEdge(String city1, String city2, int distance){  // ASSUMPTION: for an edge to be added cities must allready be in the graph. This method will not add Vertices
        boolean full = false;
        int cIndex1;
        int cIndex2;

        for(int i = 0; i<cities.length; i++){
            if(cities[i] == city1){
                cIndex1 = i;
            }
            if(cities[i] == city2){
                cIndex2 = i;
            }
        }
        dist[cIndex1][cIndex2] = dist;
        dist[cIndex2][cIndex1] = dist;
    }

    



}