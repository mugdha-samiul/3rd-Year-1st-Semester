package client;

public class JsonToXmlAdapter implements IAdapter{
    private JSON json;

    public JsonToXmlAdapter(JSON json){
        this.json = json;
    }

    @Override
    public XML convert(JSON json) {
        return this.json.convertToXML();
    }
}