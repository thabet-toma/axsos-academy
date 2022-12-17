const express = require("express");
const app = express();
const port = 8000;

// req is short for request
// res is short for response


// const server = app.listen(8000, () =>
//   console.log(`Server is locked and loaded on port ${server.address().port}!`)
// );

// The import line will look different than what is in Faker's documentation
// because we are working with an express application
const { faker } = require('@faker-js/faker');
// we can create a function to return a random / fake "Product"
const createUSER = () => {
    const newFakeUser = {
        id: faker.datatype.uuid(),
        password:  faker.internet.password(),
        phoneNumber: faker.phone.number(),
        lastName:faker.name.lastName(),
        firstName:faker.name.firstName(),
        Email:faker.internet.email(),
        

    };
    return newFakeUser;
};
const createCompany = () => {
    const newFakeCompny = {
        id: faker.datatype.uuid(),
        name:  faker.company.name(),
        streat:faker.address.street(),
        country:faker.address.country(),
        city:faker.address.city(),
       state:faker.address.state(),
        zipcode:faker.address.zipCode()


       

    };
    return newFakeCompny;
};
    

app.get("/api/users/new", (req, res) => {
  res.send(createUSER());
});
app.get("/api/companies/new", (req, res) => {
  res.send(createCompany());
});
app.get("/api/user/company", (req, res) => {
  res.send({USER:createCompany(),Company:createUSER()});
});
/*
 * The output of the above console log will look like this
 * {
 *   name: 'Anime Figure',
 *   price: '$568.00
 *   department: 'Tools' 
 * }
 */
app.listen( port, () => console.log(`Listening on port: ${port}`) );
