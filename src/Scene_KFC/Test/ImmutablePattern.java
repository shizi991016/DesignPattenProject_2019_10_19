package Test;

import Class.pack.Wrapper;
import Class.product.BigMac;

import java.lang.reflect.Parameter;

public class ImmutablePattern {
    public static void main(String[] args) {
        BigMac bigmac=new BigMac();
        pack.Packing pack=bigmac.packing();
        System.out.println(pack.getMaterial());
        pack.setMaterial();
        System.out.println(pack.getMaterial());





    }
}
