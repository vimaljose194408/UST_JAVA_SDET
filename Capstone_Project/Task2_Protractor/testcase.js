
describe('Protractor Demo',()=>{
    browser.ignoreSynchronization=true;
it('Should navigate to Demo Page',()=> {
     
   
    browser.get('https://www.urbanladder.com/');
    browser.getCurrentUrl().then((url) =>{
       expect(url).toBe('https://www.urbanladder.com/');

    });

    browser.get('https://www.urbanladder.com/dining-table-set?src=g_topnav_dining_dining-tables-sets');
    browser.getCurrentUrl().then((url) =>{
       expect(url).toBe('https://www.urbanladder.com/dining-table-set?src=g_topnav_dining_dining-tables-sets');

    });

    
    it("Title test", function () {
        expect(browser.getTitle()).toEqual("Dining Tables: Upto 20% Off | Buy Wooden Dining Table Sets Online - Urban Ladder");
      });

     browser.get('https://www.urbanladder.com/dining-tables?src=g_topnav_dining_dining-tables-sets_dining-tables#page-3');

    browser.getCurrentUrl().then((url) =>{
       expect(url).toBe('https://www.urbanladder.com/dining-tables?src=g_topnav_dining_dining-tables-sets_dining-tables#page-3');

    }); 
    it("Title test", function () {
        expect(browser.getTitle()).toEqual("Dining Table: Buy Dining Tables Online [2021 Dining Table Design] - Urban Ladder");
      });

    it("Exclude Out Of Stock checkbox test", function () {
        expect(filters[availability].isSelected()).toBe(false);
         filters_availability_In_Stock_Only.click();
        expect(filters[availability].isSelected()).toBe(true);
      });
      browser.get('https://www.urbanladder.com/products/arabia-6-seater-dining-table?sku=FNTBDI11TK10001&src=subcat');

      browser.getCurrentUrl().then((url) =>{
         expect(url).toBe('https://www.urbanladder.com/products/arabia-6-seater-dining-table?sku=FNTBDI11TK10001&src=subcat');
  
      }); 
      it("Title test", function () {
          expect(browser.getTitle()).toEqual("Arabia 6 Seater Dining Table - Urban Ladder");
        }); 
});
});