<template>

  <!--只能有一个div-->
  <div id="app">

    <el-container style="height: 500px; border: 1px solid #eee">
      <el-aside width="200px" style="background-color: rgb(238, 241, 246)">

        <!--default-openeds默认打开哪些，-->
        <!--<el-menu :default-openeds="['1', '3']">-->

          <!--<el-submenu index="1">-->
            <!--<template slot="title"><i class="el-icon-message"></i>导航一</template>-->

            <!--<el-menu-item-group>-->
              <!--<template slot="title">分组一</template>-->
              <!--<el-menu-item index="1-1">选项1</el-menu-item>-->
              <!--<el-menu-item index="1-2">选项2</el-menu-item>-->
            <!--</el-menu-item-group>-->

            <!--<el-menu-item-group title="分组2">-->
              <!--<el-menu-item index="1-3">选项3</el-menu-item>-->
            <!--</el-menu-item-group>-->

            <!--<el-submenu index="1-4">-->
              <!--<template slot="title">选项4</template>-->
              <!--<el-menu-item index="1-4-1">选项4-1</el-menu-item>-->
            <!--</el-submenu>-->
          <!--</el-submenu>-->



          <!--&lt;!&ndash;表示可以折叠&ndash;&gt;-->
          <!--<el-submenu index="2">-->
            <!--&lt;!&ndash;i是图标&ndash;&gt;-->
            <!--<template slot="title"><i class="el-icon-menu"></i>导航二</template>-->

            <!--&lt;!&ndash;分组&ndash;&gt;-->
            <!--<el-menu-item-group>-->
              <!--&lt;!&ndash;标题&ndash;&gt;-->
              <!--<template slot="title">分组一</template>-->
              <!--&lt;!&ndash;最小项&ndash;&gt;-->
              <!--<el-menu-item index="2-1">选项1</el-menu-item>-->
              <!--&lt;!&ndash;index是下标&ndash;&gt;-->
              <!--<el-menu-item index="2-2">选项2</el-menu-item>-->
            <!--</el-menu-item-group>-->

            <!--<el-menu-item-group title="分组2">-->
              <!--<el-menu-item index="2-3">选项3</el-menu-item>-->
            <!--</el-menu-item-group>-->


            <!--&lt;!&ndash;表示可以折叠&ndash;&gt;-->
            <!--<el-submenu index="2-4">-->
              <!--<template slot="title">选项4</template>-->
              <!--<el-menu-item index="2-4-1">选项4-1</el-menu-item>-->
            <!--</el-submenu>-->

          <!--</el-submenu>-->





          <!--<el-submenu index="3">-->
            <!--<template slot="title"><i class="el-icon-setting"></i>导航三</template>-->
            <!--<el-menu-item-group>-->
              <!--<template slot="title">分组一</template>-->
              <!--<el-menu-item index="3-1">选项1</el-menu-item>-->
              <!--<el-menu-item index="3-2">选项2</el-menu-item>-->
            <!--</el-menu-item-group>-->
            <!--<el-menu-item-group title="分组2">-->
              <!--<el-menu-item index="3-3">选项3</el-menu-item>-->
            <!--</el-menu-item-group>-->
            <!--<el-submenu index="3-4">-->
              <!--<template slot="title">选项4</template>-->
              <!--<el-menu-item index="3-4-1">选项4-1</el-menu-item>-->
            <!--</el-submenu>-->
          <!--</el-submenu>-->


        <!--</el-menu>-->


        <el-menu>

          <!--$router.options.routes表示读取index.js下的节点,index表示当前循环的下标(需要写到前面)-->
          <el-submenu v-for="(item,index) in $router.options.routes":index="index+' '">

              <!--标题-->
              <template slot="title">{{index}}-{{item.name}}</template>

              <el-menu-item  v-for="(item2,index2) in item.childern":index="index+'-'+index2">{{index}}.{{index2}}-{{item2.name}}</el-menu-item>

          </el-submenu>

        </el-menu>




      </el-aside>

      <el-container>

        <el-header style="text-align: right; font-size: 12px">
          <el-dropdown>
            <i class="el-icon-setting" style="margin-right: 15px"></i>
            <el-dropdown-menu slot="dropdown">
              <el-dropdown-item>查看</el-dropdown-item>
              <el-dropdown-item>新增</el-dropdown-item>
              <el-dropdown-item>删除</el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>
          <span>王小虎</span>
        </el-header>



        <!--这个是页面的正文部分-->
        <el-main>
          <!--这个是其他页面的窗口，变换的都是这个部分-->
          <router-view>

            <el-table :data="tableData">
              <el-table-column prop="date" label="日期" width="140">
              </el-table-column>
              <el-table-column prop="name" label="姓名" width="120">
              </el-table-column>
              <el-table-column prop="address" label="地址">
              </el-table-column>
            </el-table>

          </router-view>


        </el-main>


      </el-container>

    </el-container>




  </div>
</template>



<!--<script>-->
<!--import HelloWorld from './components/HelloWorld.vue'-->

<!--export default {-->
  <!--name: 'app',-->
  <!--components: {-->
    <!--HelloWorld-->
  <!--}-->




<!--}-->
<!--</script>-->


<script>
    export default {
        data() {
            const item = {
                date: '2016-05-02',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
            };
            return {
                tableData: Array(20).fill(item)
            }
        }
    };
</script>




<style>
  .el-header {
    background-color: #B3C0D1;
    color: #333;
    line-height: 60px;
  }

  .el-aside {
    color: #333;
  }
</style>
