/**
 *          你他妈的想干嘛就干嘛公共许可证
 *               第二版，2004年12月
 *
 * 版权所有(C) 2004 serv<liuyuhua69@gmail.com>
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
import com.github.izerui.weixin.mappings.Status;
import org.junit.Test;

import java.util.List;

/**
 * Created by serv on 16/4/21.
 */
public class GroupTest extends BaseTest {

    @Test
    public void test0(){
        System.out.println("s");
    }

    @Test
    public void groups(){

        List<Group> groups = engine.getGroupService(accessToken).groups();
        System.out.println(groups.toString());
    }

    @Test
    public void create(){
        Group group = engine.getGroupService(accessToken).create("ddd");
        System.out.println(group);
    }

    @Test
    public void update(){
        Status update = engine.getGroupService(accessToken).update(new Group(100, "123321123321"));
        System.out.println(update);
    }

    @Test
    public void delete(){
        Status delete = engine.getGroupService(accessToken).delete(106);
        System.out.println(delete);
    }

}