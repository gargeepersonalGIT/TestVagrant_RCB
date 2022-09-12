public class players {

    public class JsonDataReader {
        private final String jsonFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath() + "MatchJsonFile.json";
        private List<Player> playerList;

        public JsonDataReader(){
            playerList = getPlayersData();
        }
        private List<Player> getPlayersData() {
            Gson gson = new Gson();
            BufferedReader bufferReader = null;
            try {
                bufferReader = new BufferedReader(new FileReader(jsonFilePath));
                Player[] players = gson.fromJson(bufferReader, Player[].class);
                return Arrays.asList(players);
            }catch(FileNotFoundException e) {
                throw new RuntimeException("Json file not found at path : " + jsonFilePath);
            }finally {
                try { if(bufferReader != null) bufferReader.close();}
                catch (IOException ignore) {}
            }
        }

        public Boolean validateAtleastOneWicketKeeper(){
            Player wicketKeeper = playerList.stream().filter(x -> x.role.equalsIgnoreCase('Wicket-keeper')).findAny().get();
            return wicketKeeper != "" || wicketKeeper != null;
        }
        public Boolean validateOnly4Foreginers(String customerName){
            Player[] foreignPlayers = playerListList.stream().filter(x -> !x.country.equalsIgnoreCase('India'));
            return foreignPlayers.size() == 4;
        }
}
