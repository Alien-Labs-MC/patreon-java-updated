package com.patreon.objects;

import java.util.HashMap;

public class PatreonPledge {
    private String type;
    private String id;
    private Attributes attributes;
    private Relationships relationships;

    public PatreonPledge(String type, String id, Attributes attributes, Relationships relationships) {
        this.type = type;
        this.id = id;
        this.attributes = attributes;
        this.relationships = relationships;
    }

    public String getId() {
        return id;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public Relationships getRelationships() {
        return relationships;
    }

    public static class Relationships {
        private HashMap<String, Object> address;
        private DataLink card;
        private DataLink creator;
        private DataLink patron;
        private DataLink reward;

        public Relationships(HashMap<String, Object> address, DataLink card, DataLink creator, DataLink patron, DataLink reward) {
            this.address = address;
            this.card = card;
            this.creator = creator;
            this.patron = patron;
            this.reward = reward;
        }

        public DataLink getCard() {
            return card;
        }

        public HashMap<String, Object> getAddress() {
            return address;
        }

        public DataLink getReward() {
            return reward;
        }

        public DataLink getPatron() {
            return patron;
        }

        public DataLink getCreator() {
            return creator;
        }

        public static class DataLink {
            private Data data;
            private HashMap<String, String> links;

            public DataLink(Data data, HashMap<String, String> links) {
                this.data = data;
                this.links = links;
            }

            public Data getData() {
                return data;
            }

            public HashMap<String, String> getLinks() {
                return links;
            }
        }
    }

    public static class Attributes {
        private int amount_cents;
        private String created_at;
        private String declined_since;
        private int pledge_cap_cents;
        private boolean patron_pays_fees;

        public Attributes(int amount_cents, String created_at, String declined_since, int pledge_cap_cents, boolean patron_pays_fees) {
            this.amount_cents = amount_cents;
            this.created_at = created_at;
            this.declined_since = declined_since;
            this.pledge_cap_cents = pledge_cap_cents;
            this.patron_pays_fees = patron_pays_fees;
        }

        public int getAmountCents() {
            return amount_cents;
        }

        public boolean doesPatronPayFees() {
            return patron_pays_fees;
        }

        public int getPledgeCapCents() {
            return pledge_cap_cents;
        }

        public String getCreatedAt() {
            return created_at;
        }

        public String getDeclinedSince() {
            return declined_since;
        }
    }
}
