<template>
    <!--一个template中只能有一个div-->
    <div>
        <table>
            <tr>
                <td>编号</td>
                <td>name</td>
                <td>passwd</td>
            </tr>
            <!--for循环-->
            <tr v-for="user in users">
                <td>{{user.id}}}</td>
                <td>{{user.name}}}</td>
                <td>{{user.pwd}}}</td>
            </tr>
           \
        </table>
    </div>
</template>

<script>
    export default {
        name: "Book",
        // 前段的数据源头
        data(){
            return {
                msg:'testMsg',
                users:[{id:1,name:'name',pwd:'lili'},
                    {id:2,name:'name2',pwd:'lili2'},
                    {id:2,name:'name2',pwd:'lili2'}]

            }
        },
        // 初始化函数,可以在这里请求后台的数据
        created(){


            const _this = this;

            //then是请求后的回掉
            axios.get('http://localhost:8181/').then(function (resp) {
                //回掉中写this表示回掉函数，无法表示外部的user
                // this.users = resp.data()

                _this.users = resp.data
            })

        }


    }
</script>

<style scoped>

</style>