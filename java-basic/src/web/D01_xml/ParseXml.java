package web.D01_xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.util.List;

public class ParseXml {
  public static void main(String[] args) throws DocumentException, FileNotFoundException {
    SAXReader re = new SAXReader();
    Document dom = re.read(ParseXml.class.getResourceAsStream("/web/D01_xml/books.xml"));

   /* Element rootElement = dom.getRootElement();
    List<Element> listArr = rootElement.elements("book");
    for (Element e : listArr) {
      System.out.println(e.attributeValue("id"));  //��ǰԪ�ص�����ֵ
      System.out.println(e.elementText("name")); //��Ԫ�صı�ǩֵ

      List<Element> elements = e.elements();
      for (Element s : elements) {
        System.out.println(s.getName() + ":" + s.getText());   //��ǰԪ�صı�ǩ����ֵ
      }
    }*/

    //���Xpathʹ�ã��ǳ����㣬����ѡ������ڵ�
    // /��Ԫ��/��Ԫ��/��Ԫ��
    List<Element> selectNodes = dom.selectNodes("/books/book"); //ĳ��·���µ�book
    // ����ڵ�/�ӽڵ�
    List<Element> selectNodes1 = dom.selectNodes("//book/name"); //ȡ�ĵ������е�book�µ�name
    //����ֵ��ĳһ�ڵ�
    Node node = dom.selectSingleNode("//book[@id='0001']");

    for (Element e : selectNodes1) {
      System.out.println(e.attribute("id"));
      System.out.println(e.elementText("name"));
      System.out.println(e.getName());
      System.out.println(e.getText());
    }
    //XML������Լ��:
    // DTDԼ��   �Ƚϼ򵥣�����С�͵�XML�ļ�����Լ��
    // SchemaԼ�� ����xml�ļ�Լ����������ϸԼ������������
  }
}