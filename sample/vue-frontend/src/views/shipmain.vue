<template>
  <v-container>
    <v-card style="width: 30%">
      <v-text-field v-model="b1" label="1 or 2"></v-text-field>
      <v-btn outlined @click="button">Click</v-btn>
      <p>{{a}}</p>
    </v-card>
  </v-container>
</template>

<script>

export default {
  el : 'ship',
  data: () => ({
    b1: '',
    a: ''
  }),
  methods: {
    button (){
      console.log('button');
      this.axios.get('/ship/test').than(result => {
        console.log('result: ' + result);
      });

    }
  }
}
</script>
