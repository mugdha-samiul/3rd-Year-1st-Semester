/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package client;

/**
 *
 * @author User
 */
public class Client {

    public static void main(String[] args) {
        JSON json = new JSON("json data");
        IAdapter iAdapter = new JsonToXmlAdapter(json);
        XML xml = iAdapter.convert(json);
        
        Proto proto = new Proto("proto data");
        iAdapter = new ProtoToXmlAdapter(proto);
        xml = iAdapter.convert(json);
    }
    
}
