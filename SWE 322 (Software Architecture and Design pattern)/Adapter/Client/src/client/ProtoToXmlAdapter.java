/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

public class ProtoToXmlAdapter implements IAdapter {
    private Proto proto;

    public ProtoToXmlAdapter(Proto proto) {
        this.proto = proto;
    }

    /**
     *
     * @param json
     * @return
     */
    @Override
    public XML convert(JSON json) {
        // Assuming JSON to Proto conversion logic here
        return this.proto.convertToXML();
    }
}
