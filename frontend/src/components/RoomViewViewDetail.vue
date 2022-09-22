<template>

    <v-card outlined>
        <v-card-title>
            RoomView # {{$route.params.id }}
        </v-card-title>

        <v-card-text>
            <div>
                <Number label="RoomId" v-model="item.roomId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="ReservationId" v-model="item.reservationId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="PaymentId" v-model="item.paymentId" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="RoomStatus" v-model="item.roomStatus" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="RoomPrice" v-model="item.roomPrice" :editMode="editMode" @change="change" />
            </div>
            <div>
                <Number label="ReviewCnt" v-model="item.reviewCnt" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="ReservationStatus" v-model="item.reservationStatus" :editMode="editMode" @change="change" />
            </div>
            <div>
                <String label="PayStatus" v-model="item.payStatus" :editMode="editMode" @change="change" />
            </div>
        </v-card-text>
    </v-card>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'RoomViewViewDetail',
    props: {
      value: Object,
    },
    data: () => ({
        item : [],
    }),
    async created() {
      var params = this.$route.params;
      var temp = await axios.get(axios.fixUrl('/roomViews/' + params.id))

      this.item = temp.data;

    },
    methods: {
    }
  }
</script>

