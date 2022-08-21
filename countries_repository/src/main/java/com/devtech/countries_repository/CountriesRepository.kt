package com.devtech.countries_repository

import java.util.*
import kotlin.collections.ArrayList

object CountriesRepository {

    private val arrayList: ArrayList<Country> = ArrayList<Country>()

    init {
        setArrayListWithID()
    }

    fun getAllCountries() = arrayList

    fun getCountryList(query: String): List<Country> = arrayList.filter { country ->
        country.name.toLowerCase(Locale.ROOT).contains(query.toLowerCase(Locale.ROOT))
                || country.numericCode.toString() == query
    }

    private fun setArrayListWithID() {
        arrayList.add(Country("Afghanistan", "AF", 93, 0))
        arrayList.add(Country("Åland Islands", "AX", 358, 0))
        arrayList.add(Country("Albania", "AL", 355, 0))
        arrayList.add(Country("Algeria", "DZ", 213, 0))
        arrayList.add(Country("American Samoa", "AS", 1684, 0))
        arrayList.add(Country("Andorra", "AD", 376, 0))
        arrayList.add(Country("Angola", "AO", 244, 0))
        arrayList.add(Country("Anguilla", "AI", 1264, 0))
        arrayList.add(Country("Antarctica", "AQ", 672, 0))
        arrayList.add(Country("Antigua and Barbuda", "AG", 1268, 0))
        arrayList.add(Country("Argentina", "AR", 54, 0))
        arrayList.add(Country("Armenia", "AM", 374, 0))
        arrayList.add(Country("Aruba", "AW", 297, 0))
        arrayList.add(Country("Australia", "AU", 61, 0))
        arrayList.add(Country("Austria", "AT", 43, 0))
        arrayList.add(Country("Azerbaijan", "AZ", 994, 0))
        arrayList.add(Country("Bahamas", "BS", 1242, 0))
        arrayList.add(Country("Bahrain", "BH", 973, 0))
        arrayList.add(Country("Bangladesh", "BD", 880, 0))
        arrayList.add(Country("Barbados", "BB", 1246, 0))
        arrayList.add(Country("Belarus", "BY", 375, 0))
        arrayList.add(Country("Belgium", "BE", 32, 0))
        arrayList.add(Country("Belize", "BZ", 501, 0))
        arrayList.add(Country("Benin", "BJ", 229, 0))
        arrayList.add(Country("Bermuda", "BM", 1441, 0))
        arrayList.add(Country("Bhutan", "BT", 975, 0))
        arrayList.add(Country("Bolivia (Plurinational State of)", "BO", 591, 0))
        arrayList.add(
            Country(
                "Bonaire, Sint Eustatius and Saba",
                "BQ",
                5997,
                0
            )
        )
        arrayList.add(Country("Bosnia and Herzegovina", "BA", 387, 0))
        arrayList.add(Country("Botswana", "BW", 267, 0))
        arrayList.add(Country("Bouvet Island", "BV", 47, 0))
        arrayList.add(Country("Brazil", "BR", 55, 0))
        arrayList.add(Country("British Indian Ocean Territory", "IO", 246, 0))
        arrayList.add(Country("Virgin Islands (British)", "VG", 1284, 0))
        arrayList.add(Country("Virgin Islands (U.S.)", "VI", 1340, 0))
        arrayList.add(Country("Brunei Darussalam", "BN", 673, 0))
        arrayList.add(Country("Bulgaria", "BG", 359, 0))
        arrayList.add(Country("Burkina Faso", "BF", 226, 0))
        arrayList.add(Country("Burundi", "BI", 257, 0))
        arrayList.add(Country("Cambodia", "KH", 855, 0))
        arrayList.add(Country("Cameroon", "CM", 237, 0))
        arrayList.add(Country("Canada", "CA", 1, 0))
        arrayList.add(Country("Cabo Verde", "CV", 238, 0))
        arrayList.add(Country("Cayman Islands", "KY", 1345, 0))
        arrayList.add(Country("Central African Republic", "CF", 236, 0))
        arrayList.add(Country("Chad", "TD", 235, 0))
        arrayList.add(Country("Chile", "CL", 56, 0))
        arrayList.add(Country("China", "CN", 86, 0))
        arrayList.add(Country("Christmas Island", "CX", 61, 0))
        arrayList.add(Country("Cocos (Keeling) Islands", "CC", 61, 0))
        arrayList.add(Country("Colombia", "CO", 57, 0))
        arrayList.add(Country("Comoros", "KM", 269, 0))
        arrayList.add(Country("Congo", "CG", 242, 0))
        arrayList.add(
            Country(
                "Congo (Democratic Republic of the)",
                "CD",
                243,
                0
            )
        )
        arrayList.add(Country("Cook Islands", "CK", 682, 0))
        arrayList.add(Country("Costa Rica", "CR", 506, 0))
        arrayList.add(Country("Croatia", "HR", 385, 0))
        arrayList.add(Country("Cuba", "CU", 53, 0))
        arrayList.add(Country("Curaçao", "CW", 599, 0))
        arrayList.add(Country("Cyprus", "CY", 357, 0))
        arrayList.add(Country("Czech Republic", "CZ", 420, 0))
        arrayList.add(Country("Denmark", "DK", 45, 0))
        arrayList.add(Country("Djibouti", "DJ", 253, 0))
        arrayList.add(Country("Dominica", "DM", 1767, 0))
        arrayList.add(Country("Dominican Republic", "DO", 1809, 0))
        arrayList.add(Country("Ecuador", "EC", 593, 0))
        arrayList.add(Country("Egypt", "EG", 20, 0))
        arrayList.add(Country("El Salvador", "SV", 503, 0))
        arrayList.add(Country("Equatorial Guinea", "GQ", 240, 0))
        arrayList.add(Country("Eritrea", "ER", 291, 0))
        arrayList.add(Country("Estonia", "EE", 372, 0))
        arrayList.add(Country("Ethiopia", "ET", 251, 0))
        arrayList.add(Country("Falkland Islands (Malvinas)", "FK", 500, 0))
        arrayList.add(Country("Faroe Islands", "FO", 298, 0))
        arrayList.add(Country("Fiji", "FJ", 679, 0))
        arrayList.add(Country("Finland", "FI", 358, 0))
        arrayList.add(Country("France", "FR", 33, 0))
        arrayList.add(Country("French Guiana", "GF", 594, 0))
        arrayList.add(Country("French Polynesia", "PF", 689, 0))
        arrayList.add(Country("Gabon", "GA", 241, 0))
        arrayList.add(Country("Gambia", "GM", 220, 0))
        arrayList.add(Country("Georgia", "GE", 995, 0))
        arrayList.add(Country("Germany", "DE", 49, 0))
        arrayList.add(Country("Ghana", "GH", 233, 0))
        arrayList.add(Country("Gibraltar", "GI", 350, 0))
        arrayList.add(Country("Greece", "GR", 30, 0))
        arrayList.add(Country("Greenland", "GL", 299, 0))
        arrayList.add(Country("Grenada", "GD", 1473, 0))
        arrayList.add(Country("Guadeloupe", "GP", 590, 0))
        arrayList.add(Country("Guam", "GU", 1671, 0))
        arrayList.add(Country("Guatemala", "GT", 502, 0))
        arrayList.add(Country("Guernsey", "GG", 44, 0))
        arrayList.add(Country("Guinea", "GN", 224, 0))
        arrayList.add(Country("Guinea-Bissau", "GW", 245, 0))
        arrayList.add(Country("Guyana", "GY", 592, 0))
        arrayList.add(Country("Haiti", "HT", 509, 0))
        arrayList.add(Country("Holy See", "VA", 379, 0))
        arrayList.add(Country("Honduras", "HN", 504, 0))
        arrayList.add(Country("Hong Kong", "HK", 852, 0))
        arrayList.add(Country("Hungary", "HU", 36, 0))
        arrayList.add(Country("Iceland", "IS", 354, 0))
        arrayList.add(Country("India", "IN", 91, 0))
        arrayList.add(Country("Indonesia", "ID", 62, 0))
        arrayList.add(Country("Côte d'Ivoire", "CI", 225, 0))
        arrayList.add(Country("Iran (Islamic Republic of)", "IR", 98, 0))
        arrayList.add(Country("Iraq", "IQ", 964, 0))
        arrayList.add(Country("Ireland", "IE", 353, 0))
        arrayList.add(Country("Isle of Man", "IM", 44, 0))
        arrayList.add(Country("Israel", "IL", 972, 0))
        arrayList.add(Country("Italy", "IT", 39, 0))
        arrayList.add(Country("Jamaica", "JM", 1876, 0))
        arrayList.add(Country("Japan", "JP", 81, 0))
        arrayList.add(Country("Jersey", "JE", 44, 0))
        arrayList.add(Country("Jordan", "JO", 962, 0))
        arrayList.add(Country("Kazakhstan", "KZ", 76, 0))
        arrayList.add(Country("Kenya", "KE", 254, 0))
        arrayList.add(Country("Kiribati", "KI", 686, 0))
        arrayList.add(Country("Kuwait", "KW", 965, 0))
        arrayList.add(Country("Kyrgyzstan", "KG", 996, 0))
        arrayList.add(Country("Lao People's Democratic Republic", "LA", 856, 0))
        arrayList.add(Country("Latvia", "LV", 371, 0))
        arrayList.add(Country("Lebanon", "LB", 961, 0))
        arrayList.add(Country("Lesotho", "LS", 266, 0))
        arrayList.add(Country("Liberia", "LR", 231, 0))
        arrayList.add(Country("Libya", "LY", 218, 0))
        arrayList.add(Country("Liechtenstein", "LI", 423, 0))
        arrayList.add(Country("Lithuania", "LT", 370, 0))
        arrayList.add(Country("Luxembourg", "LU", 352, 0))
        arrayList.add(Country("Macao", "MO", 853, 0))
        arrayList.add(
            Country(
                "Macedonia (the former Yugoslav Republic of)",
                "MK",
                389,
                0
            )
        )
        arrayList.add(Country("Madagascar", "MG", 261, 0))
        arrayList.add(Country("Malawi", "MW", 265, 0))
        arrayList.add(Country("Malaysia", "MY", 60, 0))
        arrayList.add(Country("Maldives", "MV", 960, 0))
        arrayList.add(Country("Mali", "ML", 223, 0))
        arrayList.add(Country("Malta", "MT", 356, 0))
        arrayList.add(Country("Marshall Islands", "MH", 692, 0))
        arrayList.add(Country("Martinique", "MQ", 596, 0))
        arrayList.add(Country("Mauritania", "MR", 222, 0))
        arrayList.add(Country("Mauritius", "MU", 230, 0))
        arrayList.add(Country("Mayotte", "YT", 262, 0))
        arrayList.add(Country("Mexico", "MX", 52, 0))
        arrayList.add(Country("Micronesia (Federated States of)", "FM", 691, 0))
        arrayList.add(Country("Moldova (Republic of)", "MD", 373, 0))
        arrayList.add(Country("Monaco", "MC", 377, 0))
        arrayList.add(Country("Mongolia", "MN", 976, 0))
        arrayList.add(Country("Montenegro", "ME", 382, 0))
        arrayList.add(Country("Montserrat", "MS", 1664, 0))
        arrayList.add(Country("Morocco", "MA", 212, 0))
        arrayList.add(Country("Mozambique", "MZ", 258, 0))
        arrayList.add(Country("Myanmar", "MM", 95, 0))
        arrayList.add(Country("Namibia", "NA", 264, 0))
        arrayList.add(Country("Nauru", "NR", 674, 0))
        arrayList.add(Country("Nepal", "NP", 977, 0))
        arrayList.add(Country("Netherlands", "NL", 31, 0))
        arrayList.add(Country("New Caledonia", "NC", 687, 0))
        arrayList.add(Country("New Zealand", "NZ", 64, 0))
        arrayList.add(Country("Nicaragua", "NI", 505, 0))
        arrayList.add(Country("Niger", "NE", 227, 0))
        arrayList.add(Country("Nigeria", "NG", 234, 0))
        arrayList.add(Country("Niue", "NU", 683, 0))
        arrayList.add(
            Country(
                "Korea (Democratic People's Republic of)",
                "KP",
                850,
                0
            )
        )
        arrayList.add(Country("Northern Mariana Islands", "MP", 1670, 0))
        arrayList.add(Country("Norway", "NO", 47, 0))
        arrayList.add(Country("Oman", "OM", 968, 0))
        arrayList.add(Country("Pakistan", "PK", 92, 0))
        arrayList.add(Country("Palau", "PW", 680, 0))
        arrayList.add(Country("Palestine, State of", "PS", 970, 0))
        arrayList.add(Country("Panama", "PA", 507, 0))
        arrayList.add(Country("Papua New Guinea", "PG", 675, 0))
        arrayList.add(Country("Paraguay", "PY", 595, 0))
        arrayList.add(Country("Peru", "PE", 51, 0))
        arrayList.add(Country("Philippines", "PH", 63, 0))
        arrayList.add(Country("Pitcairn", "PN", 64, 0))
        arrayList.add(Country("Poland", "PL", 48, 0))
        arrayList.add(Country("Portugal", "PT", 351, 0))
        arrayList.add(Country("Puerto Rico", "PR", 1787, 0))
        arrayList.add(Country("Qatar", "QA", 974, 0))
        arrayList.add(Country("Réunion", "RE", 262, 0))
        arrayList.add(Country("Romania", "RO", 40, 0))
        arrayList.add(Country("Russian Federation", "RU", 7, 0))
        arrayList.add(Country("Rwanda", "RW", 250, 0))
        arrayList.add(Country("Saint Barthélemy", "BL", 590, 0))
        arrayList.add(
            Country(
                "Saint Helena, Ascension and Tristan da Cunha",
                "SH",
                290,
                0
            )
        )
        arrayList.add(Country("Saint Kitts and Nevis", "KN", 1869, 0))
        arrayList.add(Country("Saint Lucia", "LC", 1758, 0))
        arrayList.add(Country("Saint Martin (French part)", "MF", 590, 0))
        arrayList.add(
            Country(
                "Saint Vincent and the Grenadines",
                "VC",
                1784,
                0
            )
        )
        arrayList.add(Country("Samoa", "WS", 685, 0))
        arrayList.add(Country("San Marino", "SM", 378, 0))
        arrayList.add(Country("Sao Tome and Principe", "ST", 239, 0))
        arrayList.add(Country("Saudi Arabia", "SA", 966, 0))
        arrayList.add(Country("Senegal", "SN", 221, 0))
        arrayList.add(Country("Serbia", "RS", 381, 0))
        arrayList.add(Country("Seychelles", "SC", 248, 0))
        arrayList.add(Country("Sierra Leone", "SL", 232, 0))
        arrayList.add(Country("Singapore", "SG", 65, 0))
        arrayList.add(Country("Sint Maarten (Dutch part)", "SX", 1721, 0))
        arrayList.add(Country("Slovakia", "SK", 421, 0))
        arrayList.add(Country("Slovenia", "SI", 386, 0))
        arrayList.add(Country("Solomon Islands", "SB", 677, 0))
        arrayList.add(Country("Somalia", "SO", 252, 0))
        arrayList.add(Country("South Africa", "ZA", 27, 0))
        arrayList.add(
            Country(
                "South Georgia and the South Sandwich Islands",
                "GS",
                500,
                0
            )
        )
        arrayList.add(Country("Korea (Republic of)", "KR", 82, 0))
        arrayList.add(Country("South Sudan", "SS", 211, 0))
        arrayList.add(Country("Spain", "ES", 34, 0))
        arrayList.add(Country("Sri Lanka", "LK", 94, 0))
        arrayList.add(Country("Sudan", "SD", 249, 0))
        arrayList.add(Country("Suriname", "SR", 597, 0))
        arrayList.add(Country("Svalbard and Jan Mayen", "SJ", 4779, 0))
        arrayList.add(Country("Swaziland", "SZ", 268, 0))
        arrayList.add(Country("Sweden", "SE", 46, 0))
        arrayList.add(Country("Switzerland", "CH", 41, 0))
        arrayList.add(Country("Syrian Arab Republic", "SY", 963, 0))
        arrayList.add(Country("Taiwan", "TW", 886, 0))
        arrayList.add(Country("Tajikistan", "TJ", 992, 0))
        arrayList.add(Country("Tanzania, United Republic of", "TZ", 255, 0))
        arrayList.add(Country("Thailand", "TH", 66, 0))
        arrayList.add(Country("Timor-Leste", "TL", 670, 0))
        arrayList.add(Country("Togo", "TG", 228, 0))
        arrayList.add(Country("Tokelau", "TK", 690, 0))
        arrayList.add(Country("Tonga", "TO", 676, 0))
        arrayList.add(Country("Trinidad and Tobago", "TT", 1868, 0))
        arrayList.add(Country("Tunisia", "TN", 216, 0))
        arrayList.add(Country("Turkey", "TR", 90, 0))
        arrayList.add(Country("Turkmenistan", "TM", 993, 0))
        arrayList.add(Country("Turks and Caicos Islands", "TC", 1649, 0))
        arrayList.add(Country("Tuvalu", "TV", 688, 0))
        arrayList.add(Country("Uganda", "UG", 256, 0))
        arrayList.add(Country("Ukraine", "UA", 380, 0))
        arrayList.add(Country("United Arab Emirates", "AE", 971, 0))
        arrayList.add(
            Country(
                "United Kingdom of Great Britain and Northern Ireland",
                "GB",
                44,
                0
            )
        )
        arrayList.add(Country("United States of America", "US", 1, 0))
        arrayList.add(Country("Uruguay", "UY", 598, 0))
        arrayList.add(Country("Uzbekistan", "UZ", 998, 0))
        arrayList.add(Country("Vanuatu", "VU", 678, 0))
        arrayList.add(
            Country(
                "Venezuela (Bolivarian Republic of)",
                "VE",
                58,
                0
            )
        )
        arrayList.add(Country("Viet Nam", "VN", 84, 0))
        arrayList.add(Country("Wallis and Futuna", "WF", 681, 0))
        arrayList.add(Country("Western Sahara", "EH", 212, 0))
        arrayList.add(Country("Yemen", "YE", 967, 0))
        arrayList.add(Country("Zambia", "ZM", 260, 0))
        arrayList.add(Country("Zimbabwe", "ZW", 263, 0))
    }

}