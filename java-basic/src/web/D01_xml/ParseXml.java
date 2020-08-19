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
      System.out.println(e.attributeValue("id"));  //当前元素的属性值
      System.out.println(e.elementText("name")); //子元素的标签值

      List<Element> elements = e.elements();
      for (Element s : elements) {
        System.out.println(s.getName() + ":" + s.getText());   //当前元素的标签名和值
      }
    }*/

    //结合Xpath使用，非常方便，可以选择任意节点
    // /根元素/子元素/孙元素
    List<Element> selectNodes = dom.selectNodes("/books/book"); //某个路径下的book
    // 任意节点/子节点
    List<Element> selectNodes1 = dom.selectNodes("//book/name"); //取文档中所有的book下的name
    //属性值的某一节点
    Node node = dom.selectSingleNode("//book[@id='0001']");

    for (Element e : selectNodes1) {
      System.out.println(e.attribute("id"));
      System.out.println(e.elementText("name"));
      System.out.println(e.getName());
      System.out.println(e.getText());
    }
    //XML有两种约束:
    // DTD约束   比较简单，对中小型的XML文件进行约束
    // Schema约束 大型xml文件约束，可以详细约束到数据类型
  }
}