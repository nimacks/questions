import java.util.List;

enum OutputFormat {
    MARKDOWN,HTML
}

interface ListStrategy {
    default void start(StringBuilder sb){}
    void addListItem(StringBuilder sb, String item);
    default void end (StringBuilder sb) {}
}

//Build different strategies for building a list builder

class MarkdownListStrategy implements ListStrategy {

    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append("*").append(item)
                .append(System.lineSeparator());

    }
}

class HtmlListStrategy implements ListStrategy {

    @Override
    public void start(StringBuilder sb) {
        sb.append("<ul>").append(System.lineSeparator());
    }

    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append(" <li>").append(item)
                .append("</li>")
                .append(System.lineSeparator());
    }

    @Override
    public void end(StringBuilder sb) {
        sb.append("</ul>").append(System.lineSeparator());
    }
}

class TextProcessor {
    private ListStrategy listStrategy;
    private StringBuilder sb = new StringBuilder();

    public TextProcessor(OutputFormat format) {
        setOutputFormat(format);
    }

    private void setOutputFormat(OutputFormat format) {
        switch (format){
            case HTML:
                listStrategy = new HtmlListStrategy();
                break;
            case MARKDOWN:
                listStrategy = new MarkdownListStrategy();
                break;
            default:
                break;
        }

    }
    public void appendList(List<String> items) {
        listStrategy.start(sb);
        for(String item: items) {
            listStrategy.addListItem(sb,item);
        }
        listStrategy.end(sb);
    }

    public void clear(){
        sb.setLength(0);
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}

class Demo {
    public static void main(String[] args) {
        TextProcessor tp = new TextProcessor(OutputFormat.HTML);
        tp.appendList(List.of("John","Judas","James"));
        System.out.println(tp.toString());
    }
}