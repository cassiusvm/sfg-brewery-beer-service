/*
 *  Copyright 2019 the original author or authors.
 *
 * This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package guru.sfg.brewery.beer_service.bootstrap;

import guru.sfg.brewery.beer_service.domain.Brewery;
import guru.sfg.brewery.beer_service.repositories.BeerRepository;
import guru.sfg.brewery.beer_service.repositories.BreweryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;


/**
 * Created by jt on 2019-01-26.
 */
@Component
public class DefaultBreweryLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";
    public static final UUID BEER_1_UUID = UUID.fromString("0a818933-087d-47f2-ad83-2f986ed087eb");
    public static final UUID BEER_2_UUID = UUID.fromString("a712d914-61ea-4623-8bd0-32c0f6545bfd");
    public static final UUID BEER_3_UUID = UUID.fromString("026cc3c8-3a0c-4083-a05b-e908048c1b08");

    private final BreweryRepository breweryRepository;
    private final BeerRepository beerRepository;


    public DefaultBreweryLoader(BreweryRepository breweryRepository,
                                BeerRepository beerRepository) {
        this.breweryRepository = breweryRepository;
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBreweryData();
    }

    private void loadBreweryData() {
        if (breweryRepository.count() == 0){
            breweryRepository.save(Brewery
                    .builder()
                    .breweryName("Cage Brewing")
                    .build());

//            Beer mangoBobs = Beer.builder()
//                    .beerName("Mango Bobs")
//                    .beerStyle(BeerStyleEnum.IPA)
//                    .minOnHand(12)
//                    .quantityToBrew(200)
//                    .quantityOnHand(500)
//                    .id(BEER_1_UUID)
//                    .upc(BEER_1_UPC)
//                    .build();

           // beerRepository.save(mangoBobs);

//            Beer galaxyCat = Beer.builder()
//                    .beerName("Galaxy Cat")
//                    .beerStyle(BeerStyleEnum.PALE_ALE)
//                    .minOnHand(12)
//                    .quantityToBrew(200)
//                    .id(BEER_2_UUID)
//                    .upc(BEER_2_UPC)
//                    .build();
//
//            beerRepository.save(galaxyCat);

//            Beer pinball = Beer.builder()
//                    .beerName("Pinball Porter")
//                    .beerStyle(BeerStyleEnum.PORTER)
//                    .minOnHand(12)
//                    .quantityToBrew(200)
//                    .id(BEER_3_UUID)
//                    .upc(BEER_3_UPC)
//                    .build();
//
//            beerRepository.save(pinball);

        }
    }
}
