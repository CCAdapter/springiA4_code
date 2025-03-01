
/**
 * FileName:     IceCream.java
 * Createdate:   2019-02-16 21:51:45
 */

package com.lzc.assembly.ambiguity.impl3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lzc.assembly.ambiguity.Dessert;

/**
 * Description: 冰淇淋  
 * Copyright:   Copyright (c)2019    
 * @author: LZC
 * @version: 1.0
 * @date: 2019-02-16 21:51:45
 *
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019-02-16   LZC         1.0         1.0 Version  
 */
@Component
@Qualifier("cold")
public class IceCream implements Dessert {

    @Override
    public void desc() {
        System.out.println("iceCream");
    }

}
