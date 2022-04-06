public class Edge {
    private Integer source;
    private Integer sink;
    private Integer cost;
    
    // weighted edge
    public Edge(Integer source, Integer sink, Integer cost) {
        this.source = source;
        this.sink = sink;
        this.cost = cost;
    }

    // non-weighted edge
    public Edge(Integer source, Integer sink) {
        this.source = source;
        this.sink = sink;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getSink() {
        return sink;
    }

    public void setSink(Integer sink) {
        this.sink = sink;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    
    
}
