/**
 *          你他妈的想干嘛就干嘛公共许可证
 *               第二版，2004年12月
 *
 * 版权所有(C) 2004 桑·奥塞瓦<sam@hocevar.net>
 *
 * 任何人都有复制与发布本协议的原始或修改过的版本的权利。
 * 若本协议被修改，须修改协议名称。
 *
 *          你他妈的想干嘛就干嘛公共许可证
 *              复制、发布和修改条款
 *
 *  0. 你只要他妈的想干嘛就干嘛好了。
 */
package junit;

import com.github.izerui.weixin.mappings.Group;
import org.junit.Test;

import java.util.List;

/**
 * Created by serv on 16/4/21.
 */
public class GroupJunit extends BaseJunit{

    @Test
    public void groups(){

        List<Group> groups = engine.getGroupService(accessToken).groups();
        System.out.println(groups.toString());
    }

}
