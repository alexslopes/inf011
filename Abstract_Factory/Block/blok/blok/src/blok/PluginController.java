/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok;

import blok.interfaces.IAbstractProduct1;
import blok.interfaces.IAbstractProduct2;
import blok.interfaces.IPlugin;
import blok.interfaces.IPluginController;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class PluginController implements IPluginController {
    private List<IPlugin> pluginFactory = new ArrayList<>();
    
    @Override
    public boolean initialize() {
        try{
        lerPlugin();
        }catch(Exception e){
            System.out.println(e);
        }
        return true;
    }

    /*public void createProducts(){
        try{
            this.lerPlugin();
            for(IPlugin p : pluginFactory){
                IAbstractProduct1 p1 = p.createProduct1();
                p1.sayHello();
                IAbstractProduct2 p2 = p.createProduct2();
                p2.sayHi();
            }       
        }catch(Exception e){
            System.out.println(e);
        }
        
    }*/
    
    private void lerPlugin() throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
            File currentDir = new File("./plugins");//localiza diretorio
            String[] plugins = currentDir.list();//lista de diret[orios 
            int i;
            URL[] jars = new URL[plugins.length];
            for (i = 0; i < plugins.length; i++) {
                System.out.println(i + 1 + " - " + plugins[i].split("\\.")[0]);
                //System.out.println(i);
                jars[i] = (new File("./plugins/" + plugins[i])).toURL();
                URLClassLoader ulc = new URLClassLoader(jars);
                String factoryName = plugins[i].split("\\.")[0];
                IPlugin factory = (IPlugin) Class.forName(factoryName.toLowerCase() + "." + factoryName, true, ulc).newInstance();
                pluginFactory.add(factory);
            }
           
            
            //URLClassLoader ulc = new URLClassLoader(jars);
            //System.out.println(i + 1 + " - Plugin refresh");
            //System.out.println("Escolha sua opção ou 0 para sair: ");
            //Scanner sc = new Scanner(System.in);
            //op = sc.nextInt();
            //if (op != 0 && op != i + 1) {
              //  String factoryName = plugins[op - 1].split("\\.")[0];
              //  IPlugin factory = (IPlugin) Class.forName(factoryName.toLowerCase() + "." + factoryName, true, ulc).newInstance();
               // pluginFactory.add(factory);
            
    }
}

